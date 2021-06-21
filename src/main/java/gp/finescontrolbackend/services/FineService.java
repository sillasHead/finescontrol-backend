package gp.finescontrolbackend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gp.finescontrolbackend.dtos.FineDTO;
import gp.finescontrolbackend.entities.FineEntity;
import gp.finescontrolbackend.repositories.FineRepository;

@Service
public class FineService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private FineRepository repository;

    @Transactional(readOnly = true)
    public List<FineDTO> findAll() {
        return repository.findAll().stream()
            .map(fine -> modelMapper.map(fine, FineDTO.class))
            .collect(Collectors.toList());
    }    

    @Transactional
    public FineDTO insert(FineDTO fineDTO) {
        FineEntity fine = modelMapper.map(fineDTO, FineEntity.class);
        
        fine = repository.save(fine);
        return modelMapper.map(fine, FineDTO.class);
    }
}
