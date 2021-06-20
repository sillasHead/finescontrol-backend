package gp.finescontrolbackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import gp.finescontrolbackend.entities.CarEntity;

public interface CarRepository extends JpaRepository<CarEntity, Long> {
    
    @Query("Select c from CarEntity c order by c.status desc, c.name")
    public List<CarEntity> findAll();
}
