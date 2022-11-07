package base_de_datos;

import java.sql.PreparedStatement;
import java.util.List;
import logico.OrdenProduccion;

public class DAO_OrdenProduccion implements DAO<OrdenProduccion>{

    @Override
    public void create(OrdenProduccion object) throws Exception {
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("INSERT INTO OrdenDeProduccion (fecha_Pedido, fecha_Limite, fecha_realizacion, receta, precio_total) VALUES (?,?,?,?,?)");
            st.setDate(1, object.getFechaPedido());
            st.setDate(2, object.getFecha_limite());
            st.setDate(3, object.getFecha_realizacion());
            st.setString(4, object.getReceta());
            st.setDouble(5, object.getPrecioTotal());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
    }

    @Override
    public Object read(int id) throws Exception {
        return null;
    }

    @Override
    public void update(OrdenProduccion object, int id) throws Exception {
        
    }

    @Override
    public void delete(int id) throws Exception {
        
    }

    @Override
    public List<OrdenProduccion> findAll() throws Exception {
        return null;
    }

    @Override
    public Object consulta(int id) throws Exception {
        return null;
    }
    
}
