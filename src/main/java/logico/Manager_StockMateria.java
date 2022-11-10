package logico;

import base_de_datos.DAOStockMateria;
import java.sql.SQLException;
import java.util.List;

public class Manager_StockMateria {
    public DAOStockMateria daostockMateria;

    public Manager_StockMateria() throws SQLException {
        daostockMateria = new DAOStockMateria();
    }
    public void cargarStockMateria(double cant, Deposito dep, MateriaPrima mat) throws Exception{
        StockMateria stock = new StockMateria(cant,dep.getId(),mat.getNombre());
        daostockMateria.create(stock);
    }
    public void modificarStockMateria(StockMateria stock) throws Exception{
        //No Support yet
    }
    public void eliminarStockMateria(StockMateria stock) throws Exception{
        //No Support yet
    }
    public List<StockMateria> listarStockAll() throws Exception{
        return daostockMateria.findAll();
    }
    
    
}
