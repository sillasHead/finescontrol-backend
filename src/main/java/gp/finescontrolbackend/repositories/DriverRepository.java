package gp.finescontrolbackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import gp.finescontrolbackend.entities.DriverEntity;

public interface DriverRepository extends JpaRepository<DriverEntity, Long> {
    
    @Query("select d from DriverEntity d order by d.status desc, d.name")
    public List<DriverEntity> findAll();
}
