
package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import logico.MateriaPrima;
import logico.Renglon;

public class DAORenglon implements DAO<Renglon>{

    @Override
    public void create(Renglon object) throws Exception {
        int id_Orden = 0;
        try {
            PreparedStatement st = ConexionBD.getConexion().prepareStatement("SELECT max(ID_OrdenDeCompra) from OrdenDeCompra;");
            ResultSet rs = st.executeQuery();
            if(rs.next()) id_Orden = rs.getInt(1);
            st = ConexionBD.getConexion()
                    .prepareStatement("INSERT INTO Renglon (ID_Renglon, Cantidad, Precio, ID_Materia_Tiene, ID_Orden_Corresponde) VALUES (?,?,?,?)");
            st.setDouble(2, object.getCantidad());
            st.setDouble(3, object.getPrecio());
            st.setObject(4, object.getID_Tiene());
            st.setInt(5, id_Orden);
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
                    .prepareStatement("DELETE FROM Renglon where ID_Renglon = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
    }
    
     @Override
    public void update(Renglon object, int id) throws Exception {
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("UPDATE Renglon set Cantidad = ?, Precio = ?, ID_Materia_Tiene = ?, where ID_Renglon = ?");
            st.setDouble(1, object.getCantidad());
            st.setDouble(2, object.getPrecio());
            st.setObject(3, object.getID_Tiene());
            st.setInt(5, id);
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
    }

    @Override
    public List<Renglon> findAll() throws Exception {
        List<Renglon> listaRenglones = null;
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM Renglon");
            listaRenglones = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Renglon renglon = new Renglon();
                renglon.setCantidad(rs.getDouble(2));
                renglon.setPrecio(rs.getDouble(3));
                renglon.setID_Tiene(rs.getInt(4));
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
    
    public Renglon consulta(int id) throws Exception {
        Renglon renglon = new Renglon();
        
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM Renglon WHERE ID_Renglon = ?");
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                renglon.setCantidad(rs.getDouble(2));
                renglon.setPrecio(rs.getDouble(3));
                renglon.setID_Tiene(rs.getInt(4));
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
    
    public List<Renglon> findAllDeOrden(int id) throws Exception {
        List<Renglon> listaRenglones = null;
        try {
            System.out.println("esta por hacer el select id orden corresponde en el dao renglon");
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM Renglon WHERE ID_Orden_Corresponde = ?");
            listaRenglones = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            System.out.println("ya hizo el select id corresponde en dao renglon");
            while(rs.next()){
                Renglon renglon = new Renglon();
                renglon.setCantidad(rs.getDouble(2));
                renglon.setPrecio(rs.getDouble(3));
                renglon.setID_Tiene(rs.getInt(4));
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
