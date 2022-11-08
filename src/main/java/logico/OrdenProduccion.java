package logico;

import java.sql.Date;

public class OrdenProduccion extends Orden{
    private Date fecha_limite;
    private Date fecha_realizacion;
    private String receta;
    private int id;
    
    public OrdenProduccion(Date fecha_pedido, double precio_total, Date fecha_limite, String receta){
        super(fecha_pedido, precio_total);
        this.fecha_limite = fecha_limite;
        this.receta = receta;
        this.fecha_realizacion = null;
    }
    
    public OrdenProduccion(){
        super(new Date(0,0,0), 0);
        this.fecha_limite = new Date(0,0,0);
        this.receta = "";
        this.fecha_realizacion = new Date(0,0,0);
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public Date getFecha_limite() {
        return fecha_limite;
    }

    public void setFecha_limite(Date fecha_limite) {
        this.fecha_limite = fecha_limite;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public Date getFecha_realizacion() {
        return fecha_realizacion;
    }

    public void setFecha_realizacion(Date fecha_realizacion) {
        this.fecha_realizacion = fecha_realizacion;
    }

    @Override
    public Date getFechaPedido() {
        return super.getFechaPedido();
    }

    @Override
    public void setFechaPedido(Date fecha_pedido) {
        super.setFechaPedido(fecha_pedido);
    }

    @Override
    public double getPrecioTotal() {
        return super.getPrecioTotal();
    }

    @Override
    public void setPrecioTotal(double precio_total) {
        super.setPrecioTotal(precio_total);
    }
    
    
   
    
    
}
