package logico;

import java.sql.Date;

public class OrdenProduccion extends Orden{
    public OrdenProduccion(Date fecha_pedido, double precio_total){
        super(fecha_pedido, precio_total);
    }
}
