package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import logico.Orden_Compra;
import logico.Proveedor;

public class DAO_OrdenDeCompra implements DAO<Orden_Compra>{

    @Override
    public void create(Orden_Compra object) throws Exception {
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("INSERT INTO OrdenDeCompra (Fecha_Pedido, Precio_Total, ID_Proveedor_Tiene) VALUES (?,?,?)");
            st.setDate(1, object.getFechaPedido());
            st.setDouble(2, object.getPrecioTotal());
            st.setInt(3, object.getID_Proveedor());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
        
    }
    
    @Override
    public void delete(int id) throws Exception {
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("DELETE FROM OrdenDeCompra where ID_OrdenDeCompra = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
        
    }

    @Override
    public void update(Orden_Compra object, int id) throws Exception {
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("UPDATE OrdenDeCompra set Fecha_Pedido = ?, Precio_Total = ?, ID_Proveedor_Tiene = ?, where ID_OrdenDeCompra = ?");
            st.setDate(1, object.getFechaPedido());
            st.setDouble(2, object.getPrecioTotal());
            st.setObject(3, object.getID_Proveedor());
            st.setInt(4, id);
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
    }


    @Override
    public List<Orden_Compra> findAll() throws Exception {
        List<Orden_Compra> listaOrdenes = null;
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM OrdenDeCompra");
            listaOrdenes = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Orden_Compra orden = null;
                orden.setFechaPedido(rs.getDate(1));
                orden.setPrecioTotal(rs.getDouble(2));
                orden.setID_Proveedor(rs.getInt(3));
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
    
    public Orden_Compra consulta(int id) throws Exception {
        Orden_Compra orden = null;
        
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM OrdenDeCompra WHERE ID_OrdenDeCompra = ?");
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                orden.setFechaPedido(rs.getDate(1));
                orden.setPrecioTotal(rs.getDouble(2));
                orden.setID_Proveedor(rs.getInt(3));
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
    
    @Override
    public Object read(int id) throws Exception {
        return null;
    }

}
