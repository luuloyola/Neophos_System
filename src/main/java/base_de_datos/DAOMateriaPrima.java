package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import logico.MateriaPrima;
import logico.TipoMat;

public class DAOMateriaPrima implements DAO<MateriaPrima>{
    ConexionBD conexion;

    public DAOMateriaPrima() throws SQLException {
        conexion = new ConexionBD();
    }
    
    @Override
    public void create(MateriaPrima object) throws Exception {
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion().prepareStatement("INSERT INTO MateriaPrima (ID_MateriaPrima, Nombre, Descripcion, Tipo_Mat, Precio_Unidad) VALUES (?,?,?,?,?)");
            st.setString(2, object.getNombre());
            st.setString(3, object.getDescripcion());
            st.setObject(4, object.getTipoMateriaPrima());
            st.setDouble(5, object.getPrecio_unidad());
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
                    .prepareStatement("DELETE FROM MateriaPrima where ID_MateriaPrima = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
    }
    
    @Override
    public void update(MateriaPrima object, int id) throws Exception {
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("UPDATE MateriaPrima set Nombre = ?, Descripcion = ?, Tipo_Mat = ?, Precio_Unidad = ?, where ID_MateriaPrima = ?");
            st.setString(1, object.getNombre());
            st.setString(2, object.getDescripcion());
            st.setObject(3, object.getTipoMateriaPrima());
            st.setDouble(4, object.getPrecio_unidad());
            st.setInt(5, id);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
    }

    @Override
    public List<MateriaPrima> findAll() throws Exception {
        List<MateriaPrima> listaMaterias = null;
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("SELECT * FROM MateriaPrima");
            listaMaterias = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                MateriaPrima materia = new MateriaPrima();
                materia.setNombre(rs.getString(2));
                materia.setDescripcion(rs.getString(3));
                materia.setTipoMateriaPrima((TipoMat) rs.getObject(4));
                materia.setPrecio_unidad(rs.getDouble(5));
                listaMaterias.add(materia);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
        return listaMaterias;
    }

    public MateriaPrima consulta(int id) throws Exception {
        MateriaPrima materia = new MateriaPrima();
        
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("SELECT * FROM MateriaPrima WHERE ID_MateriaPrima = ?");
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                materia.setNombre(rs.getString(2));
                materia.setDescripcion(rs.getString(3));
                materia.setTipoMateriaPrima((TipoMat) rs.getObject(4)); //REVISAR
                materia.setPrecio_unidad(rs.getDouble(5));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
        return materia;
    }

    @Override
    public Object read(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
