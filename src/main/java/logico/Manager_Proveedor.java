/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logico;

/**
 *
 * @author lucil
 */
public class Manager_Proveedor {

    private static Manager_Proveedor manager;
    
    public Manager_Proveedor(){
    }
    
    public static Manager_Proveedor getInstance() {
        if (Manager_Proveedor.manager == null)
        Manager_Proveedor.manager = new Manager_Proveedor();

        return Manager_Proveedor.manager;
    }

    public void seleccionarProveedor(){

    }
    
    public void consultarProveedor(){
        
    }
}
