/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logico;

import java.sql.Date;

import base_de_datos.DAO_OrdenDeCompra;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager_OrdenCompra {
    
    private static Manager_OrdenCompra manager;
    public DAO_OrdenDeCompra dao;
    
    public Manager_OrdenCompra(){
        dao = new DAO_OrdenDeCompra();
    }
    
    public static Manager_OrdenCompra getInstance() {
        if (Manager_OrdenCompra.manager == null)
        Manager_OrdenCompra.manager = new Manager_OrdenCompra();

        return Manager_OrdenCompra.manager;
    }

    /*
    La funcion generarOrdenDeCompra se encarga de cargar las ordenes de compra al sistema, este toma como 
    parametro el nombre del proveedor con el que decidio realizar la orden de compra, la fecha que se realizo el pedido,
    el precio total que tendra la orden de compra 
    */
    public void generarOrdenDeCompra(String proveedor, Date fecha_pedido, double precio_total, int id, ArrayList<Renglon_Compra> renglones) throws Exception{
        
        Orden_Compra nueva_Orden = new Orden_Compra(fecha_pedido, precio_total, proveedor, id);
        dao.create(nueva_Orden);
        
        for (int i = 0; i < renglones.size(); i++) {
            Renglon_Compra auxiliar = renglones.get(i);
            Manager_Renglon_Compra.getInstance().generarRenglon(auxiliar.getCantidad(), auxiliar.getPrecio(), auxiliar.getNombre_Tiene());
        }
    }

    
    public List<Orden_Compra> consultarTodasLasOrdenes() throws Exception{
       return dao.findAll();
    }
    
    public Map<Orden_Compra, List<Renglon_Compra>> consultarOrdenDeCompra(int id) throws Exception{
       Orden_Compra orden = null;
       List<Renglon_Compra> renglones = new ArrayList<>();
       Map<Orden_Compra, List<Renglon_Compra>> ordenCompleta = new HashMap<>();
       
       orden = dao.consulta(id);
       
       renglones = Manager_Renglon_Compra.getInstance().consultarRenglonConIDOrden(id);
       
       ordenCompleta.put(orden, renglones);
       
       return ordenCompleta; 
    }
    
}
