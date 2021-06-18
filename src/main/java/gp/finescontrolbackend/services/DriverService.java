package gp.finescontrolbackend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gp.finescontrolbackend.dtos.DriverDTO;
import gp.finescontrolbackend.entities.DriverEntity;
import gp.finescontrolbackend.repositories.DriverRepository;

@Service
public class DriverService {
    
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private DriverRepository repository;

    @Transactional(readOnly = true)
    public List<DriverDTO> findAll() {
        return repository.findAll().stream()
        .map(driver -> modelMapper.map(driver, DriverDTO.class))
        .collect(Collectors.toList());
    }

    @Transactional
    public DriverDTO insert(DriverDTO driverDTO) {
        DriverEntity driver = modelMapper.map(driverDTO, DriverEntity.class);
        driver = repository.save(driver);
        return modelMapper.map(driver, DriverDTO.class);
    }

    @Transactional
    public DriverDTO update(Long id, DriverDTO driverDTO) {
        DriverEntity driver = repository.getOne(id);
        modelMapper.map(driverDTO, driver);
        DriverDTO driverUpdated = modelMapper.map(repository.save(driver), DriverDTO.class);
        return driverUpdated;
    }
}
