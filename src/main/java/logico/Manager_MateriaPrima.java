package logico;

import base_de_datos.DAOMateriaPrima;
import java.sql.SQLException;
import java.util.List;

public class Manager_MateriaPrima {
    
    public DAOMateriaPrima daoMatPrima;

    public Manager_MateriaPrima() throws SQLException {
        daoMatPrima = new DAOMateriaPrima();
    }
    
    public void cargarMateriaPrima(String nombre, String descripcion, String tipo, double precio_unidad, int cant) throws Exception{
        MateriaPrima materia_nueva = new MateriaPrima(nombre,descripcion,tipo,precio_unidad);
        System.out.println("Se creo la materia prima");
        Manager_StockMateria stock = new Manager_StockMateria();
        stock.cargarStockMateria(cant,Deposito.getSinglentonInstance(0), materia_nueva);
        System.out.println("Se puso en la BD el stock");
        daoMatPrima.create(materia_nueva);
        System.out.println("Se puso en la BD la materia prima");
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
