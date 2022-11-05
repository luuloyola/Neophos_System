package logico;

import base_de_datos.DAOProducto;
import java.util.List;


public class Manager_Producto {
    
    private static Manager_Producto manager;
    private DAOProducto dao;
    
    public Manager_Producto(){
        dao = new DAOProducto();
    }
    
    public static Manager_Producto getInstance() {
        if (manager == null)
            manager = new Manager_Producto();

        return manager;
    }
    
    public void generarProveedor(){
        
    }
    
    public Proveedor consultarProveedor(String nombre) throws Exception{
        return null;
    }
    
    public List<Producto> getAllProductos() throws Exception{
        return dao.findAll();
    }

    
}
