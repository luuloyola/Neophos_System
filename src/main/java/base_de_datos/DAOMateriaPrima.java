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

    public DAOMateriaPrima(){
    }
    
    @Override
    public void create(MateriaPrima object) throws Exception {
        try {
            PreparedStatement st = ConexionBD.getConexion().prepareStatement("INSERT INTO MateriaPrima (Nombre, Descripcion, Tipo_Mat, Precio_Unidad) VALUES (?,?,CAST(? AS Tipo_Mat),?)");
            st.setString(1, object.getNombre());
            st.setString(2, object.getDescripcion());
            st.setObject(3, object.getTipoMateriaPrima().toString());
            st.setDouble(4, object.getPrecio_unidad());
            st.executeUpdate();
            st.close();
            System.out.println("El Sistema realizo correctamente la consulta query\n");
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
    }

    public MateriaPrima consulta(int id) throws Exception {
        MateriaPrima materia = new MateriaPrima();
        System.out.println("Esta haciendo la consulta");
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM MateriaPrima WHERE ID_MateriaPrima = ?");
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                materia.setNombre(rs.getString(2));
                materia.setDescripcion(rs.getString(3));
                materia.setTipoMateriaPrima(rs.getString(4));
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
    
    public ArrayList<MateriaPrima> findAll_proveedor(int proveedor) throws Exception {
        ArrayList<MateriaPrima> listaMateriaPrima = null;
        try {
            PreparedStatement st = ConexionBD.getConexion()
                        .prepareStatement("SELECT Nombre, Descripcion, tipo_mat, Precio_unidad FROM Provee, MateriaPrima WHERE ID_Proveedor_Provee = ? AND ID_MateriaPrima = ID_MateriaPrima_Proveida");
            st.setInt(1, proveedor);
            listaMateriaPrima = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                MateriaPrima materia = new MateriaPrima();
                materia.setNombre(rs.getString(1));
                materia.setDescripcion(rs.getString(2));
                materia.setTipoMateriaPrima(rs.getObject(3).toString());
                materia.setPrecio_unidad(rs.getDouble(4));
                listaMateriaPrima.add(materia);
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

    public ArrayList<Integer> findAll_conID(int proveedor) throws Exception {
        ArrayList<Integer> listaMateriaPrima = null;
        try {
            PreparedStatement st = ConexionBD.getConexion()
                        .prepareStatement("SELECT ID_MateriaPrima_Proveida FROM Provee WHERE ID_Proveedor_Provee = ?");
            st.setInt(1, proveedor);
            listaMateriaPrima = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                proveedor = rs.getInt(1);
                listaMateriaPrima.add(proveedor);
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
