package logico;

import base_de_datos.DAOProveedor;
import java.util.ArrayList;

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
        
    }
    
    public Proveedor consultarProveedor(String nombre) throws Exception{
        return dao.consulta(nombre);
    }
    
    public ArrayList<Proveedor> getAllProveedores() throws Exception{
        return dao.findAll();
    }
    
}
