package gp.finescontrolbackend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gp.finescontrolbackend.dtos.FineDTO;
import gp.finescontrolbackend.entities.CarEntity;
import gp.finescontrolbackend.entities.DriverEntity;
import gp.finescontrolbackend.entities.FineEntity;
import gp.finescontrolbackend.entities.InfractionEntity;
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
        // CarEntity car = modelMapper.map(fineDTO.getCar(), CarEntity.class);
        // DriverEntity driver = modelMapper.map(fineDTO.getDriver(), DriverEntity.class);
        // InfractionEntity infraction = modelMapper.map(fineDTO.getInfraction(), InfractionEntity.class);
        FineEntity fine = modelMapper.map(fineDTO, FineEntity.class);
        
        fine = repository.save(fine);
        return modelMapper.map(fine, FineDTO.class);
    }
}
