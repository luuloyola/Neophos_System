/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logico;

/**
 *
 * @author lucil
 */
public class Manager_OrdenCompra {
    
    private static Manager_OrdenCompra manager;
    
    public Manager_OrdenCompra(){
    }
    
    public static Manager_OrdenCompra getInstance() {
        if (Manager_OrdenCompra.manager == null)
        Manager_OrdenCompra.manager = new Manager_OrdenCompra();

        return Manager_OrdenCompra.manager;
    }

    public void generarOrdenDeCompra(){

    }

    public void consultarOrdenDeCompra(){
        
    }
}
