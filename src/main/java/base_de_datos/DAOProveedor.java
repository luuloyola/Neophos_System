package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import logico.Proveedor;

public class DAOProveedor implements DAO<Proveedor>{
    
    @Override
    public void create(Proveedor object) throws Exception {
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("INSERT INTO Proveedor (ID_Proveedor, Telefono, Nombre, Mail) VALUES (?,?,?,?)");
            st.setInt(2, object.getTelefono());
            st.setString(3, object.getNombre());
            st.setString(4, object.getMail());
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
                    .prepareStatement("DELETE FROM Proveedor where ID_Proveedor = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
    }
    
    @Override
    public void update(Proveedor object, int id) throws Exception {
         try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("UPDATE Proveedor set Telefono = ?, Nombre = ?, Mail = ?, where ID_Proveedor = ?");
            st.setInt(1, object.getTelefono());
            st.setString(2, object.getNombre());
            st.setString(3, object.getMail());
            st.setInt(4, id);
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
    }

  
    @Override
    public ArrayList<Proveedor> findAll() throws Exception {
        ArrayList<Proveedor> listaProveedores = null;
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM Proveedor");
            listaProveedores = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Proveedor proveedor = new Proveedor();
                proveedor.setTelefono(rs.getInt(2));
                proveedor.setNombre(rs.getString(3));
                proveedor.setMail(rs.getString(4));
                listaProveedores.add(proveedor);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
        return listaProveedores;
    }
    
    public Proveedor consulta(int id) throws Exception {
        Proveedor proveedor = new Proveedor();
        
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM Proveedor WHERE ID_Proveedor = ?");
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                proveedor.setTelefono(rs.getInt(2));
                proveedor.setNombre(rs.getString(3));
                proveedor.setMail(rs.getString(4));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
        return proveedor;
    }
    
    @Override
    public Object read(int id) throws Exception {
        return null;
    }

    

}
