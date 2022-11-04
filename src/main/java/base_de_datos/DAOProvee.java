package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import logico.Provee;

public class DAOProvee implements DAO<Provee>{

    public DAOProvee(){
    }
    
    public ArrayList<Provee> findAll_Materia_PorProveedor(String nombre) throws Exception {
        ArrayList<Provee> listaMaterias = null;
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM Provee WHERE Nombre_Proveedor_Provee = ?");
            st.setString(1, nombre);
            listaMaterias = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Provee auxiliar = new Provee(rs.getString(1), rs.getString(2), rs.getDouble(3));
                
                listaMaterias.add(auxiliar);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
        return listaMaterias;
    }

    public ArrayList<Provee> findAll_Producto_PorMateria(String nombre) throws Exception {
        ArrayList<Provee> listaMaterias = null;
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM Provee WHERE Nombre_MateriaPrima_Proveida = ?");
            st.setString(1, nombre);
            listaMaterias = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Provee auxiliar = new Provee(rs.getString(1), rs.getString(2), rs.getDouble(3));
                
                listaMaterias.add(auxiliar);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
        return listaMaterias;
    }
    
    public Provee consulta_todos(String nombreProveedor, String nombreMateria) throws Exception {
        Provee Materia = new Provee();
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM Provee WHERE Nombre_MateriaPrima_Proveida = ? AND Nombre_Proveedor_Provee = ?");
            st.setString(1, nombreMateria);
            st.setString(2, nombreProveedor);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Materia.setNombre_Proveedor(rs.getString(1));
                Materia.setNombre_Producto(rs.getString(2));
                Materia.setPrecio(rs.getDouble(3));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
        return Materia;
    }

    @Override
    public void create(Provee object) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object read(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Provee object, int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Provee> findAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object consulta(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
