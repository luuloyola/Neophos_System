package logico;

import base_de_datos.DAOProvee;
import java.util.ArrayList;

public class Manager_Provee {

    private static Manager_Provee manager;
    private DAOProvee dao;
    
    public Manager_Provee(){
        dao = new DAOProvee();
    }
    
    public static Manager_Provee getInstance() {
        if (manager == null)
            manager = new Manager_Provee();

        return manager;
    }
    
    
    public ArrayList<Provee> buscar_Materias_porProveedor(String nombre_proveedor) throws Exception{
        return dao.findAll_Materia_PorProveedor(nombre_proveedor);
    }
    
    public ArrayList<Provee> buscar_Materias_porMateria(String nombre_materia) throws Exception{
        return dao.findAll_Producto_PorMateria(nombre_materia);
    }
    
    public Provee consultar_todos(String nombre_proveedor, String nombre_materia) throws Exception{
        return dao.consulta_todos(nombre_proveedor, nombre_materia);
    }
}
