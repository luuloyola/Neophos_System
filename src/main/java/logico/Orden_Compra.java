/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logico;

import java.sql.Date;

public class Orden_Compra extends Orden {

    private String proveedor;

    public Orden_Compra(Date fecha_pedido, double precio_total, String proveedor){
        super(fecha_pedido, precio_total);
        this.proveedor = proveedor;
    }

    public Orden_Compra(){
        super(new Date(0,0,0), 0);
        this.proveedor = "";
    }

    public void setProveedor(String proveedor){
        this.proveedor = proveedor;
    }

    public String getProveedor(){
        return proveedor;
    }
    
}
