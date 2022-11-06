package logico;

public class ProductoFinal {
    private String nombre_Producto;
    private String descripcion;
    private Tipo_Empaquetado empaquetado;
    private double precio;
    
    public ProductoFinal(String nombre, String descripcion, Tipo_Empaquetado tipo, double precio){
        nombre_Producto = nombre;
        this.descripcion = descripcion;
        empaquetado = switch (tipo) {
            case TIRAS -> Tipo_Empaquetado.TIRAS;
            case PASTILLAS -> Tipo_Empaquetado.PASTILLAS;
            default -> Tipo_Empaquetado.SOBRES;
        };
        this.precio = precio;
    }

    public ProductoFinal() {
    }

    public String getNombre_Producto() {
        return nombre_Producto;
    }

    public void setNombre_Producto(String Nombre_Producto) {
        this.nombre_Producto = Nombre_Producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }

    public Tipo_Empaquetado getEmpaquetado() {
        return empaquetado;
    }

    public void setEmpaquetado(String Empaquetado) {
         if(Empaquetado.equals("TIRAS"))
            this.empaquetado = Tipo_Empaquetado.TIRAS;
         else if(Empaquetado.equals("SOBRES")){
             this.empaquetado = Tipo_Empaquetado.SOBRES;
         }
         else this.empaquetado = Tipo_Empaquetado.PASTILLAS;

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double Precio) {
        this.precio = Precio;
    }
    
}
