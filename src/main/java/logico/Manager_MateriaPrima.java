package logico;

import base_de_datos.DAOMateriaPrima;
import java.util.ArrayList;

public class Manager_MateriaPrima {
    
    public DAOMateriaPrima daoMatPrima;

    public Manager_MateriaPrima(){
        daoMatPrima = new DAOMateriaPrima();
    }
    
    public void cargarMateriaPrima(String nombre, String descripcion, String tipo, double precio_unidad, double cant) throws Exception{
        MateriaPrima materia_nueva = new MateriaPrima(nombre,descripcion,tipo,precio_unidad);
        daoMatPrima.create(materia_nueva);
        
        Manager_StockMateria stock = new Manager_StockMateria();
        stock.cargarStockMateria(cant,Deposito.getSinglentonInstance(0), materia_nueva);
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
    public ArrayList<MateriaPrima> consultarListaMaterias_Porproveedor(int proveedor) throws Exception{
        return daoMatPrima.findAll_proveedor(proveedor);
    }
    
    public ArrayList<Integer> consultarListaMaterias_IDS(int proveedor) throws Exception{
        return daoMatPrima.findAll_conID(proveedor);
    }
    
}
