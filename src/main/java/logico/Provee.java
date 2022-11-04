/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logico;

public class Provee {
    
    private String nombre_Proveedor;
    private String nombre_Producto;
    private double precio;
    
    public Provee(String nombre_Proveedor, String nombre_Producto, double precio){
        this.nombre_Proveedor = nombre_Proveedor;
        this.nombre_Producto = nombre_Producto;
        this.precio = precio;
    }

    public Provee() {
        this.nombre_Proveedor = "";
        this.nombre_Producto = "";
        this.precio = 0;
    }

    /**
     * @return the nombre_Proveedor
     */
    public String getNombre_Proveedor() {
        return nombre_Proveedor;
    }

    /**
     * @param nombre_Proveedor the nombre_Proveedor to set
     */
    public void setNombre_Proveedor(String nombre_Proveedor) {
        this.nombre_Proveedor = nombre_Proveedor;
    }

    /**
     * @return the nombre_Producto
     */
    public String getNombre_Producto() {
        return nombre_Producto;
    }

    /**
     * @param nombre_Producto the nombre_Producto to set
     */
    public void setNombre_Producto(String nombre_Producto) {
        this.nombre_Producto = nombre_Producto;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
