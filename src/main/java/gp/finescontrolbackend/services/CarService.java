package gp.finescontrolbackend.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gp.finescontrolbackend.dtos.CarDTO;
import gp.finescontrolbackend.repositories.CarRepository;

@Service
public class CarService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CarRepository repository;

    @Transactional(readOnly = true)
    public List<CarDTO> findAll() {
        List<CarDTO> cars = new ArrayList<>();
        repository.findAll().forEach(car -> 
            cars.add(modelMapper.map(car, CarDTO.class))
        );
        return cars;
    }
}
