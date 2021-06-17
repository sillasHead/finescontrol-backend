package gp.finescontrolbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gp.finescontrolbackend.entities.InfractionEntity;

public interface InfractionRepository extends JpaRepository<InfractionEntity, Long> {
    
}
