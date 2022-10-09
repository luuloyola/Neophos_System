package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import logico.MateriaPrima;
import logico.Proveedor;
import logico.TipoMat;

public class DAOMateriaPrima implements DAO<MateriaPrima>{

    public DAOMateriaPrima() throws SQLException {
    }
    
    @Override
    public void create(MateriaPrima object) throws Exception {
        try {
            PreparedStatement st = ConexionBD.getConexion().prepareStatement("INSERT INTO MateriaPrima (Nombre, Descripcion, Tipo_Mat, Precio_Unidad) VALUES (?,?,?,?)");
            st.setString(1, object.getNombre());
            st.setString(2, object.getDescripcion());
            st.setString(3, object.getTipoMateriaPrima().name());
            st.setDouble(4, object.getPrecio_unidad());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
    }

    public MateriaPrima consulta(int id) throws Exception {
        MateriaPrima materia = new MateriaPrima();

        try {
            PreparedStatement st = ConexionBD.getConexion()
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
            ConexionBD.cerrar();
        }
        return materia;
    }

    @Override
    public List<MateriaPrima> findAll() throws Exception {
        return null; //No Support yet
    }
    
    public ArrayList<MateriaPrima> findAll_proveedor(String proveedor) throws Exception {
        ArrayList<MateriaPrima> listaMateriaPrima = null;
        int id_proveedor = 0;
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT ID_Proveedor FROM Proveedor WHERE Nombre = ?");
            st.setString(1, proveedor);
            ResultSet rs = st.executeQuery();
            if(rs.next()){ 
                id_proveedor = rs.getInt(1);
                st = ConexionBD.getConexion()
                        .prepareStatement("SELECT * FROM Provee WHERE ID_Proveedor_Provee = ?");
                st.setInt(1, id_proveedor);
                listaMateriaPrima = new ArrayList<>();
                rs = st.executeQuery();
                while(rs.next()){
                    MateriaPrima materia = new MateriaPrima();
                    materia.setNombre(rs.getString(2));
                    materia.setDescripcion(rs.getString(3));
                    materia.setTipoMateriaPrima((TipoMat) rs.getObject(4)); //REVISAR
                    materia.setPrecio_unidad(rs.getDouble(5));
                    listaMateriaPrima.add(materia);
                }
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
        return listaMateriaPrima;
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
