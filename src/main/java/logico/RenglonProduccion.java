package logico;

public class RenglonProduccion {
    private double cantidad;
    private double precio;
    private String nombre; 
    
    public RenglonProduccion(double cantidad, double precio, String nombre){
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombre = nombre;
    }
    
    public RenglonProduccion(){
        this.cantidad = 0;
        this.precio = 0;
        this.nombre = "";
    }

    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
    
    public double getCantidad(){
        return cantidad;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public double getPrecio(){
        return precio;
    }

    public void setNombre_Tiene(String nombre){
        this.nombre = nombre;
    }

    public String getNombre_Tiene(){
        return nombre;
    }
}
