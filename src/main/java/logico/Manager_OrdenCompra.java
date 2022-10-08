/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logico;

import java.sql.Date;

import base_de_datos.DAO_OrdenDeCompra;

/**
 *
 * @author lucil
 */
public class Manager_OrdenCompra {
    
    private static Manager_OrdenCompra manager;
    public DAO_OrdenDeCompra dao;
    
    public Manager_OrdenCompra(){
    }
    
    public static Manager_OrdenCompra getInstance() {
        if (Manager_OrdenCompra.manager == null)
        Manager_OrdenCompra.manager = new Manager_OrdenCompra();

        return Manager_OrdenCompra.manager;
    }

    public void generarOrdenDeCompra(int ID_proveedor, Date fecha_pedido){

    }

    public void consultarOrdenDeCompra(int id) throws Exception{
       
    }
}
