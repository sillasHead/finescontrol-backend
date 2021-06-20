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
        return ResponseEntity.ok(list);
    }

    @PostMapping
    public ResponseEntity<CarDTO> insert(@Valid @RequestBody CarDTO carDTO) {
        CarDTO car = service.insert(carDTO);
        return ResponseEntity.ok(car);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<CarDTO> update(@PathVariable Long id, @Valid @RequestBody CarDTO carDTO) {
        CarDTO car = service.update(id, carDTO);
        return ResponseEntity.ok(car);
    }
}
