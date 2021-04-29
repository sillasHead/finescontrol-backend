package gp.finescontrolbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gp.finescontrolbackend.dtos.InfractionDTO;
import gp.finescontrolbackend.services.InfractionService;

@RestController
@RequestMapping(value = "/infracoes")
public class InfractionController {
    
    @Autowired
    private InfractionService service;

    @GetMapping
    public ResponseEntity<List<InfractionDTO>> findAll() {
        List<InfractionDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
