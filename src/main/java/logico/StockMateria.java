package logico;

public class StockMateria {
    
    public double cantidad;
    public Deposito deposito;
    public MateriaPrima materiaPrima;
    
    public StockMateria(Deposito deposito, MateriaPrima materiaPrima, double cant){
        this.deposito = deposito;
        this.materiaPrima = materiaPrima;
        this.cantidad = cant;
    }

    public StockMateria() {
    }

    public double getCantidad() {
        return cantidad;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public MateriaPrima getMateriaPrima() {
        return materiaPrima;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }

    public void setMateriaPrima(MateriaPrima materiaPrima) {
        this.materiaPrima = materiaPrima;
    }
        
}
