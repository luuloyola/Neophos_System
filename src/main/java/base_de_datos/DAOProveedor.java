package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import logico.Proveedor;

public class DAOProveedor implements DAO<Proveedor>{
    
    ConexionBD conexion;

    @Override
    public void create(Proveedor object) throws Exception {
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("INSERT INTO Proveedor (id, telefono, nombre, mail) VALUES (?,?,?,?)");
            st.setInt(1, object.getID());
            st.setInt(2, object.getTelefono());
            st.setString(3, object.getNombre());
            st.setString(4, object.getMail());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
        
    }

    @Override
    public void update(Proveedor object) throws Exception {
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("UPDATE Proveedor set telefono = ?, nombre = ?, mail = ?, where id = ?");
                    st.setInt(1, object.getTelefono());
                    st.setString(2, object.getNombre());
                    st.setString(3, object.getMail());
                    st.setInt(4, object.getID());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
    }

    @Override
    public void delete(Proveedor object) throws Exception {
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("DELETE FROM Proveedor where id = ?");
            st.setInt(1, object.getID());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
        
    }

    @Override
    public List<Proveedor> findAll() throws Exception {
        List<Proveedor> listaProveedores = null;
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("SELECT * FROM Orden_Compra");
            listaProveedores = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Proveedor prov = new Proveedor();
                prov.setID(rs.getInt("ID"));
                prov.setTelefono(rs.getInt("TELEFONO"));
                prov.setNombre(rs.getString("NOMBRE"));
                prov.setMail(rs.getString("MAIL"));
                listaProveedores.add(prov);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
        return listaProveedores;
    }

}
