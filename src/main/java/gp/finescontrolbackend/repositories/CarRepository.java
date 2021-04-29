package gp.finescontrolbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gp.finescontrolbackend.entities.CarEntity;

public interface CarRepository extends JpaRepository<CarEntity, Long> {
    
}
