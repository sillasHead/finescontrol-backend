package gp.finescontrolbackend.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gp.finescontrolbackend.dtos.FineDTO;
import gp.finescontrolbackend.repositories.FineRepository;

@Service
public class FineService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private FineRepository repository;

    @Transactional(readOnly = true)
    public List<FineDTO> findAll() {
        List<FineDTO> fines = new ArrayList<>();
        repository.findAll().forEach(fine -> 
            fines.add(modelMapper.map(fine, FineDTO.class))
        );
        return fines;
    }    
}
