package logico;

import base_de_datos.DAOMateriaPrima;
import java.util.List;

public class Manager_MateriaPrima {
    
    public DAOMateriaPrima daoMatPrima;

    public Manager_MateriaPrima() {
        daoMatPrima = new DAOMateriaPrima();
    }
    
    public void cargarMateriaPrima(int id, String nombre, String descripcion, int tipo, double precio_unidad, int cant) throws Exception{
        MateriaPrima materia_nueva = new MateriaPrima(id,nombre,descripcion,tipo,precio_unidad);
        Manager_StockMateria stock = new Manager_StockMateria();
        stock.cargarStockMateria(cant,Deposito.getSinglentonInstance(0), materia_nueva);
        daoMatPrima.create(materia_nueva);
    }
    public void modificarMateriaPrima(MateriaPrima materia) throws Exception{
        //No Support yet
    }
    public void eliminarMateriaPrima(MateriaPrima materia) throws Exception{
        //No Support yet
    }
    public List<MateriaPrima> consultarListaMaterias() throws Exception{
        return null; //No Support yet
    }
    
}
