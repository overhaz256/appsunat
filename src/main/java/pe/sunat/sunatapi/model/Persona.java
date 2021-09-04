package pe.sunat.sunatapi.model;

import java.util.Date;
import lombok.*;
import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Persona {
    
    private int dni;
    private String nombres;
    private String apellidos;
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Date fechaNac;
    private String direccion;

}
