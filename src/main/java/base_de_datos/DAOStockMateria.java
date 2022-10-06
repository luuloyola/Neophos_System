package base_de_datos;

import static base_de_datos.DAO.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import logico.StockMateria;

public class DAOStockMateria implements DAO<StockMateria>{

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
    public void update(StockMateria object) throws Exception {
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("UPDATE StockMateria set cantidad = ? WHERE id = ?");
            st.setInt(1,object.getCantidad());
            
        } catch (Exception e) {
        }finally {conexion.cerrar();}
    }

    @Override
    public void delete(StockMateria object) throws Exception {
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("DELETE FROM StockMateria WHERE id = ?");
            st.setInt(1,object.getId());
            
        } catch (Exception e) {
        }finally {conexion.cerrar();}
    }

    @Override
    public List<StockMateria> findAll() throws Exception {
        List<StockMateria> lista = null;
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("SELECT * FROM StockMateria");
            lista = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                StockMateria stock = new StockMateria();
                stock.setId(rs.getInt("id"));
                stock.setCantidad(rs.getInt("cantidad"));
                lista.add(stock);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
        }finally {conexion.cerrar();}
        
        return lista;
    }
    
}
