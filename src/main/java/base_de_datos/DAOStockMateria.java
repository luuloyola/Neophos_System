package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import logico.StockMateria;

public class DAOStockMateria implements DAO<StockMateria>{
    ConexionBD conexion;

    public DAOStockMateria() throws SQLException {
        conexion = new ConexionBD();
    }
    
    @Override
    public void create(StockMateria object) throws Exception {
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("INSERT INTO StockMateria (cantidad, id_materiaPrima, id_deposito) VALUES (?,?,?)");
            st.setInt(1,object.getCantidad());
            st.setInt(2,object.getMateriaPrima().getId());
            st.setInt(3,object.getDeposito().getId());
            
        } catch (Exception e) {
        }finally {conexion.cerrar();}
        
    }

    @Override
    public void update(StockMateria object, int id) throws Exception {
        //No Support yet
    }

    @Override
    public void delete(int id) throws Exception {
        //No Support yet
    }

    @Override
    public List<StockMateria> findAll() throws Exception {
        return null; //No Support yet
    }
    @Override
    public Object read(int id) throws Exception {
        return null; //No Support yet
    }
    
}
