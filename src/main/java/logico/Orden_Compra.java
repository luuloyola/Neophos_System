/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logico;

import java.sql.Date;

public class Orden_Compra extends Orden {

    private Proveedor proveedor;

    public Orden_Compra(Date fecha_pedido, double precio_total){
        super(fecha_pedido, precio_total);
    }
    
    public void seleccionar_Proveedor(){
        
    }
    
}
