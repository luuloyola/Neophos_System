/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logico;

import java.sql.Date;

import base_de_datos.DAO_OrdenDeCompra;
import java.util.ArrayList;
import java.util.List;

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

    public void generarOrdenDeCompra(int ID_proveedor, Date fecha_pedido, double precio_total, ArrayList<Double> cantidades, ArrayList<Double> precios, ArrayList<Integer> ID_MateriasPrimas) throws Exception{
        
        Orden_Compra nueva_Orden = new Orden_Compra(fecha_pedido, precio_total, ID_proveedor);
        dao.create(nueva_Orden);
        
        for (int i = 0; i <= cantidades.size(); i++) {
            Manager_Renglon.generarRenglon(cantidades.get(i), precios.get(i), ID_MateriasPrimas.get(i));
        }
    }

    public void consultarOrdenDeCompra(int id) throws Exception{
       Orden_Compra orden = null;
       List<Renglon> renglones = new ArrayList<>();
       
       orden = dao.consulta(id);
       
       renglones = Manager_Renglon.consultarRenglonConIDOrden(id);
       
       //aca deberia devolver la orden de compra y los renglones, capaz eso se puede hacer con un hashmap 
       
    }
}
