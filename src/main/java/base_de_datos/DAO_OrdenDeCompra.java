package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import logico.Orden_Compra;
import logico.Proveedor;

public class DAO_OrdenDeCompra implements DAO<Orden_Compra>{

    ConexionBD conexion;

    @Override
    public void create(Orden_Compra object) throws Exception {
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("INSERT INTO OrdenDeCompra (Fecha_Pedido, Precio_Total, ID_Proveedor_Tiene, ID_OrdenDeCompra) VALUES (?,?,?,?)");
            st.setDate(1, object.getFechaPedido());
            st.setDouble(2, object.getPrecioTotal());
            st.setObject(3, object.getProveedor());
            st.setInt(4, object.getID());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
        
    }
    
    @Override
    public void delete(int id) throws Exception {
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("DELETE FROM OrdenDeCompra where ID_OrdenDeCompra = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
        
    }

    @Override
    public void update(Orden_Compra object, int id) throws Exception {
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("UPDATE OrdenDeCompra set Fecha_Pedido = ?, Precio_Total = ?, ID_Proveedor_Tiene = ?, where ID_OrdenDeCompra = ?");
            st.setDate(1, object.getFechaPedido());
            st.setDouble(2, object.getPrecioTotal());
            st.setObject(3, object.getProveedor());
            st.setDouble(4, id);
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
    }


    @Override
    public List<Orden_Compra> findAll() throws Exception {
        List<Orden_Compra> listaOrdenes = null;
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("SELECT * FROM OrdenDeCompra");
            listaOrdenes = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Orden_Compra orden = new Orden_Compra();
                orden.setFechaPedido(rs.getDate(1));
                orden.setPrecioTotal(rs.getDouble(2));
                orden.setProveedor((Proveedor) rs.getObject(3));
                listaOrdenes.add(orden);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
        return listaOrdenes;
    }
    
    public Orden_Compra consulta(int id) throws Exception {
        Orden_Compra orden = new Orden_Compra();
        
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("SELECT * FROM OrdenDeCompra WHERE ID_OrdenDeCompra = ?");
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                orden.setFechaPedido(rs.getDate(1));
                orden.setPrecioTotal(rs.getDouble(2));
                orden.setProveedor((Proveedor) rs.getObject(3));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
        return orden;
    }
    
    @Override
    public Object read(int id) throws Exception {
        return null;
    }

}
