/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logico;

public class Proveedor {
    
    private int telefono;
    private String nombre;
    private String mail;
    
    public Proveedor(int telefono, String nombre, String mail){
        this.telefono = telefono;
        this.nombre = nombre;
        this.mail = mail;
    }

    public Proveedor(){
        this.telefono = 0;
        this.nombre = "";
        this.mail = "";
    }
    
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return telefono;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setMail(String mail){
        this.mail = mail;
    }

    public String getMail(){
        return mail;
    }
}
