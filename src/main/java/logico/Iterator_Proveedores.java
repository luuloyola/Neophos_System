/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logico;

import java.util.ArrayList;

public class Iterator_Proveedores {
    private ArrayList<Proveedor> proveedores;
    private int posicion_actual = 0;
    
    public Iterator_Proveedores(ArrayList<Proveedor> proveedores){
         this.proveedores = proveedores;
    }
    
    //@Override
     public Proveedor primero()
    {
        Proveedor obj = null;
        if( this.proveedores.isEmpty() == false ){
            this.posicion_actual = 0;
            obj = this.proveedores.get(0);
        }
        return obj;
    }
    
    //@Override
     public Proveedor siguiente()
    {
        Proveedor obj = null;
        if( (this.posicion_actual ) < this.proveedores.size() )
        {
            obj = this.proveedores.get(this.posicion_actual);
            this.posicion_actual = this.posicion_actual + 1;
        }
        return obj;
    }
    
    //@Override
     public boolean hayMas()
    {
        boolean ok = false;
        if( this.posicion_actual < (this.proveedores.size() ) )
        {
            ok = true;
        }
        return ok;
    }
    
    //@Override
     public Proveedor actual()
    {
        Proveedor obj = null;
        if( this.posicion_actual < this.proveedores.size() )
        {
            obj = this.proveedores.get( this.posicion_actual );
        }
        return obj;
    }
}
