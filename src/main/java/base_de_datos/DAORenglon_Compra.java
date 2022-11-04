
package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import logico.MateriaPrima;
import logico.Renglon_Compra;

public class DAORenglon_Compra implements DAO<Renglon_Compra>{

    @Override
    public void create(Renglon_Compra object) throws Exception {
        int id_Orden = 0;
        try {
            PreparedStatement st = ConexionBD.getConexion().prepareStatement("SELECT max(ID_OrdenDeCompra) from OrdenDeCompra;");
            ResultSet rs = st.executeQuery();
            if(rs.next()) id_Orden = rs.getInt(1);
            st = ConexionBD.getConexion()
                    .prepareStatement("INSERT INTO Renglon_Compra (Cantidad, Precio, Nombre_Materia_Tiene, ID_Orden_Corresponde) VALUES (?,?,?,?)");
            st.setDouble(1, object.getCantidad());
            st.setDouble(2, object.getPrecio());
            st.setObject(3, object.getNombre_Tiene());
            st.setInt(4, id_Orden);
            System.out.println(id_Orden);
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
                    .prepareStatement("DELETE FROM Renglon_Compra where ID_Renglon = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
    }
    
     @Override
    public void update(Renglon_Compra object, int id) throws Exception {
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("UPDATE Renglon_Compra set Cantidad = ?, Precio = ?, Nombre_Materia_Tiene = ?, where ID_Renglon = ?");
            st.setDouble(1, object.getCantidad());
            st.setDouble(2, object.getPrecio());
            st.setObject(3, object.getNombre_Tiene());
            st.setInt(5, id);
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
    }

    @Override
    public List<Renglon_Compra> findAll() throws Exception {
        List<Renglon_Compra> listaRenglones = null;
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM Renglon_Compra");
            listaRenglones = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Renglon_Compra renglon = new Renglon_Compra();
                renglon.setCantidad(rs.getDouble(2));
                renglon.setPrecio(rs.getDouble(3));
                renglon.setNombre_Tiene(rs.getString(4));
                listaRenglones.add(renglon);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
        return listaRenglones;
    }
    
    public Renglon_Compra consulta(int id) throws Exception {
        Renglon_Compra renglon = new Renglon_Compra();
        
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM Renglon_Compra WHERE ID_Renglon = ?");
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                renglon.setCantidad(rs.getDouble(2));
                renglon.setPrecio(rs.getDouble(3));
                renglon.setNombre_Tiene(rs.getString(4));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
        return renglon;
    }
    
    public List<Renglon_Compra> findAllDeOrden(int id) throws Exception {
        List<Renglon_Compra> listaRenglones = null;
        try {
            System.out.println("esta por hacer el select id orden corresponde en el dao renglon");
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM Renglon_Compra WHERE ID_Orden_Corresponde = ?");
            st.setInt(1, id);
            listaRenglones = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            System.out.println("ya hizo el select id corresponde en dao renglon");
            while(rs.next()){
                Renglon_Compra renglon = new Renglon_Compra();
                renglon.setCantidad(rs.getDouble(2));
                renglon.setPrecio(rs.getDouble(3));
                renglon.setNombre_Tiene(rs.getString(4));
                listaRenglones.add(renglon);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
        return listaRenglones;
    }

    @Override
    public Object read(int id) throws Exception {
        return null;
    }

    

}
