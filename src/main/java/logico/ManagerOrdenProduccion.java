package logico;

import base_de_datos.DAO_OrdenProduccion;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerOrdenProduccion {
    private static ManagerOrdenProduccion manager;
    private DAO_OrdenProduccion dao;
    
    private ManagerOrdenProduccion() {
        dao = new DAO_OrdenProduccion();
    }
    public static ManagerOrdenProduccion getInstance(){
        if (ManagerOrdenProduccion.manager == null)
        ManagerOrdenProduccion.manager = new ManagerOrdenProduccion();
        return ManagerOrdenProduccion.manager;
    }
     public void generarOrdenDeProduccion(Date fecha_pedido, double precio_total, ArrayList<RenglonProduccion> renglones) throws Exception{
        
        OrdenProduccion nueva_Orden = new OrdenProduccion(fecha_pedido, precio_total);
        dao.create(nueva_Orden);
        
        for (int i = 0; i < renglones.size(); i++) {
            RenglonProduccion auxiliar = renglones.get(i);
            ManagerRenglonProduccion.getInstance().generarRenglon(auxiliar.getCantidad(), auxiliar.getPrecio(), auxiliar.getNombre_Tiene());
        }
    }

    public Map<OrdenProduccion, List<RenglonProduccion>> consultarOrdenDeProduccion(int id) throws Exception{
       OrdenProduccion orden = null;
       List<RenglonProduccion> renglones = new ArrayList<>();
       Map<OrdenProduccion, List<RenglonProduccion>> ordenCompleta = new HashMap<>();
       
       orden = (OrdenProduccion) dao.consulta(id);
       
       renglones = ManagerRenglonProduccion.getInstance().consultarRenglonConIDOrden(id);
       
       ordenCompleta.put(orden, renglones);
       
       return ordenCompleta; 
    }
    
}
