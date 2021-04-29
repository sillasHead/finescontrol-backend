package gp.finescontrolbackend.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gp.finescontrolbackend.dtos.InfractionDTO;
import gp.finescontrolbackend.repositories.InfractionRepository;

@Service
public class InfractionService {
    
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private InfractionRepository repository;

    @Transactional(readOnly = true)
    public List<InfractionDTO> findAll() {
        List<InfractionDTO> infractions = new ArrayList<>();
        repository.findAll().forEach(infraction -> 
            infractions.add(modelMapper.map(infraction, InfractionDTO.class))
        );
        return infractions;
    }    
}
