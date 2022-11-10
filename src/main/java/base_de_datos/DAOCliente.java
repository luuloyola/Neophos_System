package base_de_datos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import logico.Cliente;

public class DAOCliente implements DAO<Cliente>{
    public DAOCliente() {
        
    }

    @Override
    public void create(Cliente object) throws Exception {
        
    }

    @Override
    public Object read(int id) throws Exception {
        return null;
    }

    @Override
    public void update(Cliente object, int id) throws Exception {
        
    }

    @Override
    public void delete(int id) throws Exception {
        
    }

    @Override
    public List<Cliente> findAll() throws Exception {
       ArrayList<Cliente> listaclientes = null;
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM Cliente");
            listaclientes = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Cliente cliente = new Cliente(rs.getString(1),rs.getInt(2),rs.getString(3));
                listaclientes.add(cliente);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
        return listaclientes;
    }

    @Override
    public Object consulta(int id) throws Exception {
        return null;
    }
}
