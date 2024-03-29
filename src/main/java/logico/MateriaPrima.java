package logico;

public class MateriaPrima {
    
    private String nombre;
    private String descripcion;
    private TipoMat tipoMateriaPrima;
    private double precio_unidad;

    public MateriaPrima( String nombre, String descripcion, String tipo, double precio_unidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        if("PRODUCTO_QUIMICO".equals(tipo))
        tipoMateriaPrima = TipoMat.PRODUCTO_QUIMICO;
        else tipoMateriaPrima = TipoMat.INSUMO;
        this.precio_unidad = precio_unidad;
    }
    
    public MateriaPrima(){}

    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public double getPrecio_unidad() {
        return precio_unidad;
    }

    public TipoMat getTipoMateriaPrima() {
        return tipoMateriaPrima;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public void setPrecio_unidad(double precio_unidad) {
        this.precio_unidad = precio_unidad;
    }

    public void setTipoMateriaPrima(String tipoMateriaPrima) {
        if(tipoMateriaPrima.equals("PRODUCTO_QUIMICO"))
            this.tipoMateriaPrima = TipoMat.PRODUCTO_QUIMICO;
        else this.tipoMateriaPrima = TipoMat.INSUMO;
    }
}
