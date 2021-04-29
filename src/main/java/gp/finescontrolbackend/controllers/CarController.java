package gp.finescontrolbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gp.finescontrolbackend.dtos.CarDTO;
import gp.finescontrolbackend.services.CarService;

@RestController
@RequestMapping(value = "/carros")
public class CarController {
    
    @Autowired
    private CarService service;

    @GetMapping
    public ResponseEntity<List<CarDTO>> findAll() {
        List<CarDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
