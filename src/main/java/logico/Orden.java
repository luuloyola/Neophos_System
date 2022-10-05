package logico;

import java.sql.Date;

public abstract class Orden {
    private Date fecha_pedido;
    private double precio_total;

    public Orden(Date fecha_pedido, double precio_total){
        this.fecha_pedido = fecha_pedido;
        this.precio_total = precio_total;
    }

    public boolean agregar_Renglon(){
        return false;
    }

    public boolean eliminar_Renglon(){
        return false;
    }

    public boolean modificar_renglon(){

        return false;
    }

}
