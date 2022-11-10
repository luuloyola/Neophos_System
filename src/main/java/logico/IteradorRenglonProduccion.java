package logico;

import java.util.List;

public class IteradorRenglonProduccion implements Iterador{

    private List<RenglonProduccion> consultar;
    private int posicion_actual = 0;

    public IteradorRenglonProduccion(List<RenglonProduccion> cons)
    {
        this.consultar = cons;
    }


    @Override
    public RenglonProduccion primero()
    {
        RenglonProduccion obj = new RenglonProduccion();

        if( this.consultar.isEmpty() == false){
            this.posicion_actual = 0;
            obj = this.consultar.get(0);
        }

        return obj;
    }


    @Override
    public RenglonProduccion siguiente()
    {
        RenglonProduccion obj = new RenglonProduccion();

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
    public RenglonProduccion actual()
    {
        RenglonProduccion obj = new RenglonProduccion();

        if( this.posicion_actual < this.consultar.size() )
        {
            obj = this.consultar.get(this.posicion_actual);
        }

        return obj;
    }
    
}
