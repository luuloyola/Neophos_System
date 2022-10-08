/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logico;

import java.sql.Date;

public class Orden_Compra extends Orden {

    private int ID_proveedor;

    public Orden_Compra(Date fecha_pedido, double precio_total, int ID_proveedor){
        super(fecha_pedido, precio_total);
        this.ID_proveedor = ID_proveedor;
    }

    public void setID_Proveedor(int ID_proveedor){
        this.ID_proveedor = ID_proveedor;
    }

    public int getID_Proveedor(){
        return ID_proveedor;
    }
    
}
