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
    
    private Manager_Proveedor managerProveedor;
    private Manager_Renglon managerRenglon;
    
    public Manager_OrdenCompra(Manager_Proveedor managerProveedor, Manager_Renglon managerRenglon){
        this.managerProveedor = managerProveedor;
        this.managerRenglon = managerRenglon;
    }

    public void setManagerP(Manager_Proveedor managerProveedor){
        this.managerProveedor = managerProveedor;
    }

    public Manager_Proveedor getManagerP(){
        return managerProveedor;
    }

    public void setManagerR(Manager_Renglon managerRenglon){
        this.managerRenglon = managerRenglon;
    }

    public Manager_Renglon getManagerR(){
        return managerRenglon;
    }

    public void generarOrdenDeCompra(){

    }

    public void consultarOrdenDeCompra(){
        
    }
}
