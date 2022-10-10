package logico;

import base_de_datos.DAOMateriaPrima;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Manager_MateriaPrima {
    
    public DAOMateriaPrima daoMatPrima;

    public Manager_MateriaPrima(){
        daoMatPrima = new DAOMateriaPrima();
    }
    
    public void cargarMateriaPrima(String nombre, String descripcion, String tipo, double precio_unidad, double cant) throws Exception{
        MateriaPrima materia_nueva = new MateriaPrima(nombre,descripcion,tipo,precio_unidad);
        System.out.println("El Sistema puso los datos en un objeto Materia Prima\n");
        daoMatPrima.create(materia_nueva);
        daoMatPrima.consulta(61);
        System.out.println("El Sistema puso la materia prima en la BD\n");
        
        
        Manager_StockMateria stock = new Manager_StockMateria();
        System.out.println("El Sistema puso los datos en un objeto stock\n");
        stock.cargarStockMateria(cant,Deposito.getSinglentonInstance(0), materia_nueva);
        System.out.println("El Sistema puso el stock en la BD\n");
    }
    
    public MateriaPrima consultarMateriaPrima(int id) throws Exception{
        MateriaPrima materia = daoMatPrima.consulta(id);
        return materia;
    }
    
    public void modificarMateriaPrima(MateriaPrima materia) throws Exception{
        //No Support yet
    }
    public void eliminarMateriaPrima(MateriaPrima materia) throws Exception{
        //No Support yet
    }
    public ArrayList<MateriaPrima> consultarListaMaterias_Porproveedor(String proveedor) throws Exception{
        return daoMatPrima.findAll_proveedor(proveedor);
    }
    
    public ArrayList<Integer> consultarListaMaterias_IDS(String proveedor) throws Exception{
        return daoMatPrima.findAll_conID(proveedor);
    }
    
}
