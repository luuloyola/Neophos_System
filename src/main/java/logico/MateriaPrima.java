/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logico;

/**
 *
 * @author lucil
 */
public class MateriaPrima {
    
    private int id;
    private String nombre;
    private String descripcion;
    private int tipo;
    private double precio_unidad;

    public MateriaPrima() {
    }
    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public int getTipo(){
        return tipo;
    }
    public double getPrecioUnidad(){
        return precio_unidad;
    }
    public int getId(){
        return id;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public void setTipo(int tipo){
        this.tipo=tipo;
    }
    public void setPrecioUnidad(double precio){
        precio_unidad = precio;
    }
    public void setId(int id){
        this.id=id;
    }
    
    
}
