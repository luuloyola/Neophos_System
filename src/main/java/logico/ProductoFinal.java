package logico;

public class ProductoFinal {
    private String Nombre_Producto;
    private String Descripcion;
    private Tipo_Empaquetado Empaquetado;
    private double Precio;
    
    public ProductoFinal(){
        
    }

    public String getNombre_Producto() {
        return Nombre_Producto;
    }

    public void setNombre_Producto(String Nombre_Producto) {
        this.Nombre_Producto = Nombre_Producto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Tipo_Empaquetado getEmpaquetado() {
        return Empaquetado;
    }

    public void setEmpaquetado(String Empaquetado) {
         if(Empaquetado.equals("TIRAS"))
            this.Empaquetado = Tipo_Empaquetado.TIRAS;
         else if(Empaquetado.equals("SOBRES")){
             this.Empaquetado = Tipo_Empaquetado.SOBRES;
         }
         else this.Empaquetado = Tipo_Empaquetado.PASTILLAS;

    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
}
