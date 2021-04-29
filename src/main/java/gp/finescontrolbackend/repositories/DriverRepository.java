package gp.finescontrolbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gp.finescontrolbackend.entities.DriverEntity;

public interface DriverRepository extends JpaRepository<DriverEntity, Long> {
    
}
