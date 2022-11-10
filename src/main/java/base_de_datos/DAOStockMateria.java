package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import logico.Provee;
import logico.StockMateria;

public class DAOStockMateria implements DAO<StockMateria>{

    public DAOStockMateria() {
    }
    
    @Override
    public void create(StockMateria object) throws Exception {
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("INSERT INTO Stock_Materia (Cantidad, Nombre_MateriaPrima_Proveida, ID_Deposito) VALUES (?,?,?)");
            st.setDouble(1,object.getCantidad());
            st.setString(2,object.getNom_mat());
            st.setInt(3,0); // Esto porque el deposito es Unico
            st.executeUpdate();
            st.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema en el Stock");
        }finally {
            ConexionBD.cerrar();
            }
        
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
        ArrayList<StockMateria> stock = null;
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM Stock_Materia");
            stock = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                StockMateria s = new StockMateria(rs.getInt(3),rs.getInt(1),rs.getString(2));
                stock.add(s);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
        return stock;
    }
    @Override
    public Object read(int id) throws Exception {
        return null; //No Support yet
    }

    @Override
    public Object consulta(int id) throws Exception {
        return null; //No Support yet
    }
    
}
