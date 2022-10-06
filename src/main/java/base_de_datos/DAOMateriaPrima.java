package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import logico.MateriaPrima;

public class DAOMateriaPrima implements DAO<MateriaPrima>{
    
    @Override
    public void create(MateriaPrima object) throws Exception {
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("INSERT INTO MateriaPrima (nombre, descripcion, tipo, precio) VALUES (?,?,?,?)");
            st.setString(1, object.getNombre());
            st.setString(2, object.getDescripcion());
            st.setInt(3, object.getTipo());
            st.setDouble(4, object.getPrecio_unidad());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
    }

    @Override
    public void update(MateriaPrima object) throws Exception {
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("UPDATE MateriaPrima set nombre = ?,descripcion = ?, tipo = ?, precio = ? where id = ?");
            st.setString(1, object.getNombre());
            st.setString(2, object.getDescripcion());
            st.setInt(3, object.getTipo());
            st.setDouble(4, object.getPrecio_unidad());
            st.setDouble(5, object.getId());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
    }

    @Override
    public void delete(MateriaPrima object) throws Exception {
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("DELETE FROM MateriaPrima where id = ?");
            st.setDouble(1, object.getId());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
    }

    @Override
    public List<MateriaPrima> findAll() throws Exception {
        List<MateriaPrima> lista = null;
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("SELECT * FROM MateriaPrima");
            lista = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                MateriaPrima mat = new MateriaPrima();
                mat.setId(rs.getInt("id"));
                mat.setNombre(rs.getString("nombre"));
                mat.setDescripcion(rs.getString("descripcion"));
                mat.setTipo(rs.getInt("tipo"));
                mat.setPrecio_unidad(rs.getDouble("precio"));
                lista.add(mat);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
        return lista;
    }
    
}
