package logico;

import java.util.List;

public class IteradorOrdenCompra implements Iterador{
    private List<Orden_Compra> consultar;
    private int posicion_actual = 0;

    public IteradorOrdenCompra(List<Orden_Compra> cons)
    {
        this.consultar = cons;
    }


    @Override
    public Orden_Compra primero()
    {
        Orden_Compra obj = new Orden_Compra();

        if( this.consultar.isEmpty() == false){
            this.posicion_actual = 0;
            obj = this.consultar.get(0);
        }

        return obj;
    }


    @Override
    public Orden_Compra siguiente()
    {
        Orden_Compra obj = new Orden_Compra();

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
    public Orden_Compra actual()
    {
        Orden_Compra obj = new Orden_Compra();

        if( this.posicion_actual < this.consultar.size() )
        {
            obj = this.consultar.get(this.posicion_actual);
        }

        return obj;
    }
}
