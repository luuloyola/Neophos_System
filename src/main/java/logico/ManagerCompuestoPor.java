package logico;

import base_de_datos.DAOCompuesto_por;
import java.util.Map;

public class ManagerCompuestoPor {
    
    private static ManagerCompuestoPor manager;
    private static DAOCompuesto_por dao;

    private ManagerCompuestoPor() {
        ManagerCompuestoPor.dao = new DAOCompuesto_por();
    }
    
    public static ManagerCompuestoPor getInstance() {
        if (manager == null)
            manager = new ManagerCompuestoPor();
        return manager;
    }

    
    public Map<String,Integer> buscar_Materias_porProductos(String nombre_producto) throws Exception{
        return dao.findAll_Materia_PorProveedor(nombre_producto);
    }
    
}
