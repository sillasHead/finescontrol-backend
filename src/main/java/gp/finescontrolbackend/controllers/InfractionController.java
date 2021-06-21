package gp.finescontrolbackend.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        return ResponseEntity.ok(list);
    }

    @PostMapping
    public ResponseEntity<InfractionDTO> insert(@Valid @RequestBody InfractionDTO infractionDTO) {
        InfractionDTO infraction = service.insert(infractionDTO);
        return ResponseEntity.ok(infraction);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<InfractionDTO> update(@PathVariable Long id, @Valid @RequestBody InfractionDTO infractionDTO) {
        InfractionDTO infraction = service.update(id, infractionDTO);
        return ResponseEntity.ok(infraction);
    }
}
