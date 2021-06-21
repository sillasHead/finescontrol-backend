package gp.finescontrolbackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import gp.finescontrolbackend.entities.FineEntity;

public interface FineRepository extends JpaRepository<FineEntity, Long> {
    
    @Query("Select f from FineEntity f order by f.driver.name")
    public List<FineEntity> findAll();
}
