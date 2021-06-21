package gp.finescontrolbackend.dtos;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @EqualsAndHashCode(of = "id")
public class CarDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private @Setter Long id;
    private String plate;
    private String name;
    private String renavam;
    private boolean status; //TODO converter em enum
}
