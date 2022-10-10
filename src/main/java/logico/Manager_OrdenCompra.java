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
    parametro el ID del proveedor con el decidio realizar la orden de compra, la fecha que se realizo el pedido,
    el precio total que tendra la orden de compra (atributo que es la suma de los precios de los renglones),
    luego, toma tres arreglos de listas que cada uno guardara la informacion del renglon
    es decir, en la posicion i de todos los arreglos se encuentra la informacion asociado a este renglon i
    por ejemplo: el primer renglon ingresado tendra su informacion guardada de la siguiente forma
    cantidades.get(0), precios.get(0), ID_MateriasPrimas.get(0)
    */
    public void generarOrdenDeCompra(int ID_proveedor, Date fecha_pedido, double precio_total, ArrayList<Double> cantidades, ArrayList<Double> precios, ArrayList<Integer> ID_MateriasPrimas) throws Exception{
        
        Orden_Compra nueva_Orden = new Orden_Compra(fecha_pedido, precio_total, ID_proveedor);
        dao.create(nueva_Orden);
        
        for (int i = 0; i <= cantidades.size(); i++) {
            Manager_Renglon.generarRenglon(cantidades.get(i), precios.get(i), ID_MateriasPrimas.get(i));
        }
    }

    public Map<Orden_Compra, List<Renglon>> consultarOrdenDeCompra(int id) throws Exception{
       Orden_Compra orden = null;
       List<Renglon> renglones = new ArrayList<>();
       Map<Orden_Compra, List<Renglon>> ordenCompleta = new HashMap<>();
       
       orden = dao.consulta(id);
       
       renglones = Manager_Renglon.getInstance().consultarRenglonConIDOrden(id);
       
       ordenCompleta.put(orden, renglones);
       
       return ordenCompleta; 
    }
    
}
