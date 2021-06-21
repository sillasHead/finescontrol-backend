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

@Entity @Table(name = "infraction")
@NoArgsConstructor @AllArgsConstructor
@Getter @EqualsAndHashCode(of = "id")
public class InfractionEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Setter Long id;
    private @Setter String description;
    private @Setter Double amount;
    private @Setter String type;
    private @Setter Short rating;
}
