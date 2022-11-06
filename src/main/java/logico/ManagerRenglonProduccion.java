package logico;

import base_de_datos.DAO_RenglonProduccion;
import java.util.ArrayList;
import java.util.List;

public class ManagerRenglonProduccion {
    private static ManagerRenglonProduccion manager;
    public static DAO_RenglonProduccion dao;
    
    public ManagerRenglonProduccion(){
        dao = new DAO_RenglonProduccion();
    }
    
   public static ManagerRenglonProduccion getInstance() {
        if (ManagerRenglonProduccion.manager == null)
        ManagerRenglonProduccion.manager = new ManagerRenglonProduccion();

        return ManagerRenglonProduccion.manager;
    }
    
    public void generarRenglon(double cantidad, double precio, String nombre_producto) throws Exception{
        RenglonProduccion renglon = new RenglonProduccion(cantidad, precio, nombre_producto);
        dao.create(renglon);
    }
    
    public RenglonProduccion consultarRenglon(int id) throws Exception{
        RenglonProduccion renglon = (RenglonProduccion) dao.consulta(id);
        return renglon;
    }
    
    public List<RenglonProduccion> consultarRenglonConIDOrden(int idOrden) throws Exception{
        List<RenglonProduccion> renglones = new ArrayList<>();
        renglones = dao.findAllDeOrden(idOrden);
        return renglones;
    }
}
