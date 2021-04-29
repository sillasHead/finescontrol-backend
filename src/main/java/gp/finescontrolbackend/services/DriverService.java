package gp.finescontrolbackend.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gp.finescontrolbackend.dtos.DriverDTO;
import gp.finescontrolbackend.repositories.DriverRepository;

@Service
public class DriverService {
    
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private DriverRepository repository;

    @Transactional(readOnly = true)
    public List<DriverDTO> findAll() {
        List<DriverDTO> driversDTO = new ArrayList<>();
        repository.findAll().forEach(driver -> 
            driversDTO.add(modelMapper.map(driver, DriverDTO.class))
        );
        return driversDTO;
    }
}
