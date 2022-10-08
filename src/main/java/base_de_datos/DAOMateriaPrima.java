package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("INSERT INTO MateriaPrima (Nombre, Descripcion, Tipo_Mat, Precio_Unidad) VALUES (?,?,?,?)");
            st.setString(1, object.getNombre());
            st.setString(2, object.getDescripcion());
            st.setString(3, object.getTipoMateriaPrima().name());
            st.setDouble(4, object.getPrecio_unidad());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
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
    public List<MateriaPrima> findAll() throws Exception {
        return null; //No Support yet
    }

    @Override
    public Object read(int id) throws Exception {
        return null; //No Support yet
    }

    @Override
    public void update(MateriaPrima object, int id) throws Exception {
        //No Support yet
    }

    @Override
    public void delete(int id) throws Exception {
        //No Support yet
    }


    
}
