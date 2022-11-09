package logico;

import java.util.List;

public class IteradorOrdenProduccion implements Iterador{
    private List<OrdenProduccion> consultar;
    private int posicion_actual = 0;

    public IteradorOrdenProduccion(List<OrdenProduccion> cons)
    {
        this.consultar = cons;
    }


    @Override
    public OrdenProduccion primero()
    {
        OrdenProduccion obj = new OrdenProduccion();

        if( this.consultar.isEmpty() == false){
            this.posicion_actual = 0;
            obj = this.consultar.get(0);
        }

        return obj;
    }


    @Override
    public OrdenProduccion siguiente()
    {
        OrdenProduccion obj = new OrdenProduccion();

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
    public OrdenProduccion actual()
    {
        OrdenProduccion obj = new OrdenProduccion();

        if( this.posicion_actual < this.consultar.size() )
        {
            obj = this.consultar.get(this.posicion_actual);
        }

        return obj;
    }
}
