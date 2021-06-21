package gp.finescontrolbackend.dtos;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @EqualsAndHashCode(of = "id")
public class InfractionDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String description;
    private Double amount;
    private String type;
    private Short rating;
}
