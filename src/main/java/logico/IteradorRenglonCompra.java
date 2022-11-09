/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logico;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class IteradorRenglonCompra implements Iterador{
    private List<Renglon_Compra> consultar;
    private int posicion_actual = 0;

    public IteradorRenglonCompra(List<Renglon_Compra> cons)
    {
        this.consultar = cons;
    }


    @Override
    public Renglon_Compra primero()
    {
        Renglon_Compra obj = new Renglon_Compra();

        if( this.consultar.isEmpty() == false){
            this.posicion_actual = 0;
            obj = this.consultar.get(0);
        }

        return obj;
    }


    @Override
    public Renglon_Compra siguiente()
    {
        Renglon_Compra obj = new Renglon_Compra();

        if( (this.posicion_actual ) < this.consultar.size() )
        {
            obj = this.consultar.get(this.posicion_actual);
            this.posicion_actual = this.posicion_actual + 1;
        }

        return obj;
    }


    @Override
    public boolean hayMas()
    {
        boolean ok = false;

        if( this.posicion_actual < (this.consultar.size() ) )
        {
            ok = true;
        }

        return ok;
    }

    @Override
    public Renglon_Compra actual()
    {
        Renglon_Compra obj = new Renglon_Compra();

        if( this.posicion_actual < this.consultar.size() )
        {
            obj = this.consultar.get(this.posicion_actual);
        }

        return obj;
    }
}
