package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import logico.Proveedor;

public class DAOProveedor implements DAO<Proveedor>{
    
    @Override
    public void create(Proveedor object) throws Exception {
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("INSERT INTO Proveedor (Telefono, Nombre, Mail) VALUES (?,?,?)");
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
    
    public void delete(String nombre) throws Exception {
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("DELETE FROM Proveedor where Nombre_Proveedor = ?");
            st.setString(1, nombre);
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
    }
    
    public void update(Proveedor object, String nombre) throws Exception {
         try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("UPDATE Proveedor set Telefono = ?, Nombre = ?, Mail = ?, where Nombre_Proveedor = ?");
            st.setInt(1, object.getTelefono());
            st.setString(2, object.getNombre());
            st.setString(3, object.getMail());
            st.setString(4, nombre);
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
                proveedor.setNombre(rs.getString(1));
                proveedor.setTelefono(rs.getInt(2));
                proveedor.setMail(rs.getString(3));
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
    
    public Proveedor consulta(String nombre) throws Exception {
        Proveedor proveedor = new Proveedor();
        
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM Proveedor WHERE Nombre_Proveedor = ?");
            st.setString(1, nombre);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                proveedor.setNombre(rs.getString(1));
                proveedor.setTelefono(rs.getInt(2));
                proveedor.setMail(rs.getString(3));
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

    @Override
    public void update(Proveedor object, int id) throws Exception {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(int id) throws Exception {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Object consulta(int id) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    
}
