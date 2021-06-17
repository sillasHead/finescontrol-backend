package gp.finescontrolbackend.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table(name = "fine")
@NoArgsConstructor @AllArgsConstructor
@Getter @EqualsAndHashCode(of = "id")
public class FineEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private @Setter String aitCode;
    private @Setter Instant moment;
    private @Setter Date dueDate;
    private @Setter Date paymentDate;
    private @Setter Boolean identifiedDriver;
    private @Setter Double amount;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private CarEntity car;
    
    @ManyToOne
    @JoinColumn(name = "driver_id")
    private DriverEntity driver;
    
    @ManyToOne
    @JoinColumn(name = "infraction_id")
    private InfractionEntity infraction;
}
