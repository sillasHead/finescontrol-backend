package gp.finescontrolbackend.dtos;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @EqualsAndHashCode(of = "id")
@JsonIgnoreProperties(value = "driver", allowSetters = true)
public class FineDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String aitCode;
    private Instant moment;
    private Date dueDate;
    private Date paymentDate;
    private Boolean identifiedDriver;
    private Double amount;
    private CarDTO car;
    private DriverDTO driver;
    private InfractionDTO infraction;
}
