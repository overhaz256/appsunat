package pe.sunat.sunatapi.model;

import java.util.Date;
import java.math.BigDecimal;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PagoAbono {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private BigDecimal monto;
    private Date fechaPago;
    
    
}
