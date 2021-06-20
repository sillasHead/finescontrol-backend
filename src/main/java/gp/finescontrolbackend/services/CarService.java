package gp.finescontrolbackend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gp.finescontrolbackend.dtos.CarDTO;
import gp.finescontrolbackend.entities.CarEntity;
import gp.finescontrolbackend.repositories.CarRepository;

@Service
public class CarService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CarRepository repository;

    @Transactional(readOnly = true)
    public List<CarDTO> findAll() {
        return repository.findAll().stream()
            .map(car -> modelMapper.map(car, CarDTO.class))
            .collect(Collectors.toList());
    }

    @Transactional
    public CarDTO insert(CarDTO carDTO) {
        CarEntity car = modelMapper.map(carDTO, CarEntity.class);
        car = repository.save(car);
        return modelMapper.map(car, CarDTO.class);
    }

    @Transactional
    public CarDTO update(Long id, CarDTO carDTO) {
        CarEntity car = repository.getOne(id);
        modelMapper.map(carDTO, car);
        CarDTO carUpdated = modelMapper.map(repository.save(car), CarDTO.class);
        return carUpdated;
    }
}
