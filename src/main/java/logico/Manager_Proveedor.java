/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        if (Manager_Proveedor.manager == null)
        Manager_Proveedor.manager = new Manager_Proveedor();

        return Manager_Proveedor.manager;
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
}
