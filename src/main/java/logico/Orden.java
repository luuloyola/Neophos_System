package logico;

import java.sql.Date;

public abstract class Orden {
    private Date fecha_pedido;
    private double precio_total;
    
    public Orden(Date fecha_pedido, double precio_total){
        this.fecha_pedido = fecha_pedido;
        this.precio_total = precio_total;
    }

    public void setFechaPedido(Date fecha_pedido){
        this.fecha_pedido = fecha_pedido;
    }

    public Date getFechaPedido(){
        return fecha_pedido;
    }

    public void setPrecioTotal(double precio_total){
        this.precio_total = precio_total;
    }

    public double getPrecioTotal(){
        return precio_total;
    }
   

}
