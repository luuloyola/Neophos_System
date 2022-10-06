package logico;

public class MateriaPrima {
    
    private int id;
    private String nombre;
    private String descripcion;
    private TipoMat tipoMateriaPrima;
    private int tipo;
    private double precio_unidad;

    public MateriaPrima(int id, String nombre, String descripcion, TipoMat tipoMateriaPrima, int tipo, double precio_unidad) {
        this.id = id; 
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoMateriaPrima = tipoMateriaPrima;
        this.tipo = tipo;
        this.precio_unidad = precio_unidad;
    }
    
    public MateriaPrima() { // Constructor sin parametros
    }
    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public int getTipo(){
        return tipo;
    }
    public int getId(){
        return id;
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
    public void setTipo(int tipo){
        this.tipo=tipo;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setPrecio_unidad(double precio_unidad) {
        this.precio_unidad = precio_unidad;
    }

    public void setTipoMateriaPrima(TipoMat tipoMateriaPrima) {
        this.tipoMateriaPrima = tipoMateriaPrima;
    }
    
}
