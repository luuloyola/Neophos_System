/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logico;

import java.sql.Date;

public class Orden_Compra extends Orden {

    private Proveedor proveedor;
    private int ID;

    public Orden_Compra(Date fecha_pedido, double precio_total, Proveedor proveedor, int ID){
        super(fecha_pedido, precio_total);
        this.proveedor = proveedor;
        this.ID = ID;
    }

    public Orden_Compra(){
        super(new java.util.Date(),0);
        this.proveedor = new Proveedor();
        this.ID = 0;
    }

    public void setProveedor(Proveedor proveedor){
        this.proveedor = proveedor;
    }

    public Proveedor getProveedor(){
        return proveedor;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public int getID(){
        return ID;
    }
    
    public void seleccionar_Proveedor(){
        
    }

    public void ingresarID(){
        
    }
    
}
