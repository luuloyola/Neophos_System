/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logico;
import base_de_datos.DAORenglon;
import java.util.ArrayList;
import java.util.List;


public class Manager_Renglon {
    
    private static Manager_Renglon manager;
    public static DAORenglon dao;
    
    public Manager_Renglon(){
        dao = new DAORenglon();
    }
    
    public static Manager_Renglon getInstance() {
        if (Manager_Renglon.manager == null)
        Manager_Renglon.manager = new Manager_Renglon();

        return Manager_Renglon.manager;
    }
    
    public void generarRenglon(double cantidad, double precio, String nombre_materiaPrima) throws Exception{
        Renglon renglon = new Renglon(cantidad, precio, nombre_materiaPrima);
        dao.create(renglon);
    }
    
    public Renglon consultarRenglon(int id) throws Exception{
        Renglon renglon = dao.consulta(id);
        return renglon;
    }
    
    public List<Renglon> consultarRenglonConIDOrden(int idOrden) throws Exception{
        List<Renglon> renglones = new ArrayList<>();
        renglones = dao.findAllDeOrden(idOrden);
        return renglones;
    }
}
