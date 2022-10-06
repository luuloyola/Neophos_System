package logico;

import base_de_datos.DAOStockMateria;

public class Manager_StockMateria {
    public DAOStockMateria daostockMateria;

    public Manager_StockMateria() {
        daostockMateria = new DAOStockMateria();
    }
    public void cargarStockMateria(int cant, Deposito dep, MateriaPrima mat) throws Exception{
        StockMateria stock = new StockMateria(dep, mat, cant);
        daostockMateria.create(stock);
    }
    public void modificarStockMateria(StockMateria stock) throws Exception{
        //No Support yet
    }
    public void eliminarStockMateria(StockMateria stock) throws Exception{
        //No Support yet
    }
    
    
}
