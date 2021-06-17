package gp.finescontrolbackend.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gp.finescontrolbackend.dtos.DriverDTO;
import gp.finescontrolbackend.services.DriverService;

@RestController
@RequestMapping(value = "/motoristas")
public class DriverController {
    
    @Autowired
    private DriverService service;

    @GetMapping
    public ResponseEntity<List<DriverDTO>> findAll() {
        List<DriverDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<DriverDTO> update(@PathVariable Long id, @Valid @RequestBody DriverDTO driverDTO) {
        DriverDTO driver = service.update(id, driverDTO);
        return ResponseEntity.ok(driver);
    }
}
