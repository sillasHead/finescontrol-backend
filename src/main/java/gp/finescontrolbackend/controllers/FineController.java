package gp.finescontrolbackend.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gp.finescontrolbackend.dtos.FineDTO;
import gp.finescontrolbackend.services.FineService;

@RestController
@RequestMapping(value = "/multas")
public class FineController {

    @Autowired
    private FineService service;

    @GetMapping
    public ResponseEntity<List<FineDTO>> findAll() {
        List<FineDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping
    public ResponseEntity<FineDTO> insert(@Valid @RequestBody FineDTO fineDTO) {
        FineDTO fine = service.insert(fineDTO);
        return ResponseEntity.ok(fine);
    }
}
