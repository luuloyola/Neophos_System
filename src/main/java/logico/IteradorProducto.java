
package logico;

import java.util.List;

public class IteradorProducto implements Iterador{

    private List<Producto> consultar;
    private int posicion_actual = 0;

    public IteradorProducto(List<Producto> cons)
    {
        this.consultar = cons;
    }


    @Override
    public Producto primero()
    {
        Producto obj = new Producto();

        if( this.consultar.isEmpty() == false){
            this.posicion_actual = 0;
            obj = this.consultar.get(0);
        }

        return obj;
    }


    @Override
    public Producto siguiente()
    {
        Producto obj = new Producto();

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
    public Producto actual()
    {
        Producto obj = new Producto();

        if( this.posicion_actual < this.consultar.size() )
        {
            obj = this.consultar.get(this.posicion_actual);
        }

        return obj;
    }
    
}
