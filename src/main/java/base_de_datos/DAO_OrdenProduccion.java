package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
        List<OrdenProduccion> listaOrdenes = null;
        
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM OrdenDeProduccion");
            listaOrdenes = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                OrdenProduccion orden = new OrdenProduccion();
                orden.setFechaPedido(rs.getDate(2));
                orden.setFecha_limite(rs.getDate(3));
                orden.setFecha_realizacion(rs.getDate(4));
                orden.setReceta(rs.getString(5));
                orden.setPrecioTotal(rs.getDouble(6));
                listaOrdenes.add(orden);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
        return listaOrdenes;
    }

    @Override
    public Object consulta(int id) throws Exception {
        OrdenProduccion orden = new OrdenProduccion();
        
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM OrdenDeProduccion WHERE ID_OrdenDeProduccion = ?");
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                orden.setFechaPedido(rs.getDate(2));
                orden.setFecha_limite(rs.getDate(3));
                orden.setFecha_realizacion(rs.getDate(4));
                orden.setReceta(rs.getString(5));
                orden.setPrecioTotal(rs.getDouble(6));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
        return orden;
    }
    
}
