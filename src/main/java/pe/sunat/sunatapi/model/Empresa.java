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
public class Empresa {

    private int ruc;
    private String razonSocial;
    private String direccion;
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Date fechaInscripcion;
    
}
