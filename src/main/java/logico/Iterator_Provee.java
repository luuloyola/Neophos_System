
package logico;

import java.util.ArrayList;

public class Iterator_Provee implements Iterador{
    private ArrayList<Provee> materias;
    private int posicion_actual = 0;
    
    public Iterator_Provee(ArrayList<Provee> materias){
         this.materias = materias;
    }
    
    @Override
     public Provee primero()
    {
        Provee obj = null;
        if( this.materias.isEmpty() == false ){
            this.posicion_actual = 0;
            obj = this.materias.get(0);
        }
        return obj;
    }
    
    @Override
     public Provee siguiente()
    {
        Provee obj = null;
        if( (this.posicion_actual ) < this.materias.size() )
        {
            obj = this.materias.get(this.posicion_actual);
            this.posicion_actual = this.posicion_actual + 1;
        }
        return obj;
    }
    
    @Override
     public boolean hayMas()
    {
        boolean ok = false;
        if( this.posicion_actual < (this.materias.size() ) )
        {
            ok = true;
        }
        return ok;
    }
    
    @Override
     public Provee actual()
    {
        Provee obj = null;
        if( this.posicion_actual < this.materias.size() )
        {
            obj = this.materias.get( this.posicion_actual );
        }
        return obj;
    }
}
