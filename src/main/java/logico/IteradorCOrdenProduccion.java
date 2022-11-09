/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logico;

import paneles.Consultar_OrdenDeProduccion;

/**
 *
 * @author Usuario
 */
public class IteradorCOrdenProduccion implements Iterador{
    private Consultar_OrdenDeProduccion consultar;
    private int posicion_actual = 0;

    public IteradorCOrdenProduccion(Consultar_OrdenDeProduccion cons)
    {
        this.consultar = cons;
    }


    @Override
    public OrdenProduccion primero()
    {
        OrdenProduccion obj = new OrdenProduccion();

        if( this.consultar.ordenes.isEmpty() == false){
            this.posicion_actual = 0;
            obj = this.consultar.ordenes.get(0);
        }

        return obj;
    }


    @Override
    public OrdenProduccion siguiente()
    {
        OrdenProduccion obj = new OrdenProduccion();

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
    public OrdenProduccion actual()
    {
        OrdenProduccion obj = new OrdenProduccion();

        if( this.posicion_actual < this.consultar.ordenes.size() )
        {
            obj = this.consultar.ordenes.get(this.posicion_actual);
        }

        return obj;
    }
}
