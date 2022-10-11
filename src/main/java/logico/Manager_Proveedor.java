package logico;

import base_de_datos.DAOProveedor;
import java.util.ArrayList;

/**
 *
 * @author lucil
 */
public class Manager_Proveedor {

    private static Manager_Proveedor manager;
    private DAOProveedor dao;
    
    public Manager_Proveedor(){
        dao = new DAOProveedor();
    }
    
    public static Manager_Proveedor getInstance() {
        if (manager == null)
            manager = new Manager_Proveedor();

        return manager;
    }
    
    public void generarProveedor(){
        //si queremos hacer esta funcion primero hay q eliminar ID de proveedor
    }
    
    public Proveedor consultarProveedor(int id) throws Exception{
        return dao.consulta(id);
    }
    
    public ArrayList<Proveedor> getAllProveedores() throws Exception{
        return dao.findAll();
    }
    
    public ArrayList<Integer> getAll_ID() throws Exception{
        return dao.findAll_conID();
    }
}
