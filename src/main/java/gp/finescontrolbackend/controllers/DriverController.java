package gp.finescontrolbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
        return ResponseEntity.ok().body(list);
    }
}
