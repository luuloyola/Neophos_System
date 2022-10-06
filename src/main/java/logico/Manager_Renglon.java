/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logico;

/**
 *
 * @author lucil
 */
public class Manager_Renglon {
    
    private Manager_MateriaPrima managerMateriaPrima;

    public Manager_Renglon(Manager_MateriaPrima manager_MateriaPrima){
        this.managerMateriaPrima = manager_MateriaPrima;
    }

    public void setManagerMP(Manager_MateriaPrima manager_MateriaPrima){
        this.managerMateriaPrima = manager_MateriaPrima;
    }

    public Manager_MateriaPrima getManagerMP(){
        return managerMateriaPrima;
    }
    
    public void generarRenglon(){

    }

    public void consultarRenglon(){
        
    }
}
