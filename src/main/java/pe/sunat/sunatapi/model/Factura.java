package pe.sunat.sunatapi.model;

import java.util.Date;
import java.math.BigDecimal;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Factura {
    
    private String numeroFactura;
    private String rucEmisor;
    private Date fechaEmision;
    private BigDecimal importe;
    private String estado;
}
