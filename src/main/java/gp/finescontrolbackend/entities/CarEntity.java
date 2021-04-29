package gp.finescontrolbackend.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table(name = "car")
@NoArgsConstructor @AllArgsConstructor
@Getter @EqualsAndHashCode(of = "id")
public class CarEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private @Setter String plate;
    private @Setter String brand;
    private @Setter String collor;
    private @Setter String renavam;
}
