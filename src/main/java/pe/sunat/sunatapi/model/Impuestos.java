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
public class Impuestos {
    
    private int codImpuesto;
    private String descripcionImpuesto;
    private BigDecimal importe;

}
