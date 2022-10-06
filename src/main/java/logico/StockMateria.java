package logico;

public class StockMateria {
    
    public int cantidad;
    public Deposito deposito;
    public MateriaPrima materiaPrima;
    public StockMateria(Deposito deposito, MateriaPrima materiaPrima, int cantidad){
        this.deposito = deposito;
        this.materiaPrima = materiaPrima;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
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
