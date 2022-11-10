package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import logico.Compuesto_por;

public class DAOCompuesto_por implements DAO<Compuesto_por>{

    public DAOCompuesto_por() {
    }

    
    @Override
    public void create(Compuesto_por object) throws Exception {
        
    }

    @Override
    public Object read(int id) throws Exception {
        return null;
    }

    @Override
    public void update(Compuesto_por object, int id) throws Exception {
        
    }

    @Override
    public void delete(int id) throws Exception {
        
    }

    @Override
    public List<Compuesto_por> findAll() throws Exception {
        return null;
    }

    @Override
    public Object consulta(int id) throws Exception {
        return null;
    }
    public Map<String,Integer> findAll_Materia_PorProveedor(String nombre_producto) throws SQLException{
        Map<String,Integer> listaMaterias = null;
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM Compuesto_por WHERE Nombre_Producto_Compuesto = ?");
            st.setString(1, nombre_producto);
            listaMaterias = new HashMap<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Compuesto_por com = new Compuesto_por(rs.getString(1),rs.getString(2),rs.getInt(3));
                listaMaterias.put(com.getNom_materia(),com.getCantidad());
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
}
