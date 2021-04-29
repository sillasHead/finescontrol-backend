package gp.finescontrolbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gp.finescontrolbackend.entities.FineEntity;

public interface FineRepository extends JpaRepository<FineEntity, Long> {
    
}
