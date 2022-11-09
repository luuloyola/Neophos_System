/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logico;

import paneles.ConsultarOrdenDeCompra;

/**
 *
 * @author Usuario
 */
public class IteradorCOrdenCompra implements Iterador{
    private ConsultarOrdenDeCompra consultar;
    private int posicion_actual = 0;

    public IteradorCOrdenCompra(ConsultarOrdenDeCompra cons)
    {
        this.consultar = cons;
    }


    @Override
    public Orden_Compra primero()
    {
        Orden_Compra obj = new Orden_Compra();

        if( this.consultar.ordenes.isEmpty() == false){
            this.posicion_actual = 0;
            obj = this.consultar.ordenes.get(0);
        }

        return obj;
    }


    @Override
    public Orden_Compra siguiente()
    {
        Orden_Compra obj = new Orden_Compra();

        if( (this.posicion_actual ) < this.consultar.ordenes.size() )
        {
            obj = this.consultar.ordenes.get(this.posicion_actual);
            this.posicion_actual = this.posicion_actual + 1;
        }

        return obj;
    }


    @Override
    public boolean hayMas()
    {
        boolean ok = false;

        if( this.posicion_actual < (this.consultar.ordenes.size() ) )
        {
            ok = true;
        }

        return ok;
    }

    @Override
    public Orden_Compra actual()
    {
        Orden_Compra obj = new Orden_Compra();

        if( this.posicion_actual < this.consultar.ordenes.size() )
        {
            obj = this.consultar.ordenes.get(this.posicion_actual);
        }

        return obj;
    }
}
