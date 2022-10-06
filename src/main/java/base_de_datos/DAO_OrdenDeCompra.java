package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import logico.Orden_Compra;

public class DAO_OrdenDeCompra implements DAO<Orden_Compra>{

    ConexionBD conexion;

    @Override
    public void create(Orden_Compra object) throws Exception {
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("INSERT INTO Orden_Compra (fecha_pedido, precio_total, proveedor, ID) VALUES (?,?,?,?)");
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
    public void update(Orden_Compra object) throws Exception {
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("UPDATE Orden_Compra set fecha_pedido = ?,precio_total = ?, proveedor = ?, where ID = ?");
            st.setDate(1, object.getFechaPedido());
            st.setDouble(2, object.getPrecioTotal());
            st.setObject(3, object.getProveedor());
            st.setDouble(4, object.getID());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
    }

    @Override
    public void delete(Orden_Compra object) throws Exception {
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("DELETE FROM Orden_Compra where ID = ?");
            st.setInt(1, object.getID());
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
                    .prepareStatement("SELECT * FROM Orden_Compra");
            listaOrdenes = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Orden_Compra orden = new Orden_Compra();
                orden.setID(rs.getInt("ID"));
                orden.setFechaPedido(rs.getDate("FECHA PEDIDO"));
                orden.setPrecioTotal(rs.getDouble("DESCRIPCION"));
               // orden.Proveedor(rs.getObject("PROVEEDOR"));
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

    }
