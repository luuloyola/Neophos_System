package logico;

public class StockMateria {
    
    public double cantidad;
    public int nro_deposito;
    public String nom_mat;

    public StockMateria(double cantidad, int nro_deposito, String nom_mat) {
        this.cantidad = cantidad;
        this.nro_deposito = nro_deposito;
        this.nom_mat = nom_mat;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getNom_mat() {
        return nom_mat;
    }

    public int getNro_deposito() {
        return nro_deposito;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setNom_mat(String nom_mat) {
        this.nom_mat = nom_mat;
    }

    public void setNro_deposito(int nro_deposito) {
        this.nro_deposito = nro_deposito;
    }
    
    
        
}
