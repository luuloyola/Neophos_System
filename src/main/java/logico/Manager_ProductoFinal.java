package logico;

import base_de_datos.DAOProductoFinal;
import java.util.ArrayList;

public class Manager_ProductoFinal {

    private static Manager_ProductoFinal manager;
    private DAOProductoFinal dao;
    
    public Manager_ProductoFinal(){
        dao = new DAOProductoFinal();
    }
    
    public static Manager_ProductoFinal getInstance() {
        if (manager == null)
            manager = new Manager_ProductoFinal();

        return manager;
    }
    
    
    public ArrayList<ProductoFinal> buscar_todos() throws Exception{
        return dao.findAll();
    }
    
    public ArrayList<String> compuesto_por(String nombre) throws Exception{
        return dao.compuesto_por(nombre);
    }
    
    public ProductoFinal consultar(String nombre) throws Exception{
        return dao.consulta(nombre);
    }
}
