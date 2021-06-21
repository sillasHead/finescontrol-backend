package gp.finescontrolbackend.dtos;

import java.io.Serializable;
import java.util.List;

import gp.finescontrolbackend.entities.DriverEntity;
import gp.finescontrolbackend.entities.InfractionEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FinesDriverDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String driver;
    private List<String> infractions;

    public FinesDriverDTO(DriverEntity driver, List<InfractionEntity> infractions) {
        this.driver = driver.getName();
        infractions.forEach(i -> this.infractions.add(i.getDescription()));
    }
}
