/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logico;
import base_de_datos.DAORenglon_Compra;
import java.util.ArrayList;
import java.util.List;


public class Manager_Renglon_Compra {
    
    private static Manager_Renglon_Compra manager;
    public static DAORenglon_Compra dao;
    
    public Manager_Renglon_Compra(){
        dao = new DAORenglon_Compra();
    }
    
    public static Manager_Renglon_Compra getInstance() {
        if (Manager_Renglon_Compra.manager == null)
        Manager_Renglon_Compra.manager = new Manager_Renglon_Compra();

        return Manager_Renglon_Compra.manager;
    }
    
    public void generarRenglon(double cantidad, double precio, String nombre_materiaPrima) throws Exception{
        Renglon_Compra renglon = new Renglon_Compra(cantidad, precio, nombre_materiaPrima);
        dao.create(renglon);
    }
    
    public Renglon_Compra consultarRenglon(int id) throws Exception{
        Renglon_Compra renglon = dao.consulta(id);
        return renglon;
    }
    
    public List<Renglon_Compra> consultarRenglonConIDOrden(int idOrden) throws Exception{
        List<Renglon_Compra> renglones = new ArrayList<>();
        renglones = dao.findAllDeOrden(idOrden);
        return renglones;
    }
}
