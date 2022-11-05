package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import logico.Producto;

public class DAOProducto implements DAO<Producto>{

    @Override
    public void create(Producto object) throws Exception {
    }

    @Override
    public Object read(int id) throws Exception {
        return null;
    }

    @Override
    public void update(Producto object, int id) throws Exception {
    }

    @Override
    public void delete(int id) throws Exception {
    }

    @Override
    public List<Producto> findAll() throws Exception {
        ArrayList<Producto> listaProductos = null;
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM Producto");
            listaProductos = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Producto producto = new Producto();
                producto.setNombre(rs.getString(1));
                listaProductos.add(producto);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
        return listaProductos;
    }

    @Override
    public Object consulta(int id) throws Exception {
        return null;
    }
    
}
