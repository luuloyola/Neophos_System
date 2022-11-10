package logico;
public class Compuesto_por {
    private String nom_productoF;
    private String nom_materia;
    private int cantidad;

    public Compuesto_por(String nom_productoF, String nom_materia, int cantidad) {
        this.nom_productoF = nom_productoF;
        this.nom_materia = nom_materia;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNom_materia() {
        return nom_materia;
    }

    public String getNom_productoF() {
        return nom_productoF;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setNom_materia(String nom_materia) {
        this.nom_materia = nom_materia;
    }

    public void setNom_productoF(String nom_productoF) {
        this.nom_productoF = nom_productoF;
    }

    
    
    
}
