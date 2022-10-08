/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logico;

public class Renglon {
    private double cantidad;
    private double precio;
    private int ID; // No deberia ser materia porque sino no es muy reutilizable, 
    // hay que hacer una clase padre entre mat prima y producto final -> Esto yo diria que lo podemos hacer dsp de ultima, no se (firma agus ahre)

    public Renglon(double cantidad, double precio, int ID){
        this.cantidad = cantidad;
        this.precio = precio;
        this.ID = ID;
    }

    public Renglon() {
        this.cantidad = 0;
        this.precio = 0;
        this.ID = 0;
    }

    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
    
    public double getCantidad(){
        return cantidad;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public double getPrecio(){
        return precio;
    }

    public void setID_Tiene(int ID){
        this.ID = ID;
    }

    public int getID_Tiene(){
        return ID;
    }

    

}
