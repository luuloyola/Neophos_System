package base_de_datos;

import java.sql.PreparedStatement;
import java.util.List;
import logico.MateriaPrima;

public class DAOMateriaPrima implements DAO<MateriaPrima>{
    ConexionBD conexion;

    public DAOMateriaPrima() {
        conexion = new ConexionBD();
    }
    
    @Override
    public void create(MateriaPrima object) throws Exception {
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("INSERT INTO MateriaPrima (nombre, descripcion, tipo, precio) VALUES (?,?,?,?)");
            st.setString(1, object.getNombre());
            st.setString(2, object.getDescripcion());
            st.setString(3, object.getTipoMateriaPrima().name());
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
        //No Support yet
    }

    @Override
    public void delete(MateriaPrima object) throws Exception {
        //No Support yet
    }

    @Override
    public List<MateriaPrima> findAll() throws Exception {
        return null; //No Support yet
    }

    @Override
    public Object read(int id) throws Exception {
        return null; //No Support yet
    }
    
}
