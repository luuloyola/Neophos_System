/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logico;
import base_de_datos.DAORenglon;

/**
 *
 * @author lucil
 */
public class Manager_Renglon {
    
    private static Manager_Renglon manager;
    public DAORenglon dao;
    
    public Manager_Renglon(){
        DAORenglon dao = new DAORenglon();
    }
    
    public static Manager_Renglon getInstance() {
        if (Manager_Renglon.manager == null)
        Manager_Renglon.manager = new Manager_Renglon();

        return Manager_Renglon.manager;
    }
    
    public void generarRenglon(double cantidad, double precio, MateriaPrima materiaPrima) throws Exception{
        Renglon renglon = new Renglon(cantidad, precio, materiaPrima);
        dao.create(renglon);
    }
    
    public Renglon consultarRenglon(int id) throws Exception{
        Renglon renglon = new Renglon();
        renglon = dao.consulta(id);
        return renglon;
    }
}
