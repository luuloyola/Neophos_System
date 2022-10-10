package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import logico.StockMateria;

public class DAOStockMateria implements DAO<StockMateria>{

    public DAOStockMateria() {
    }
    
    @Override
    public void create(StockMateria object) throws Exception {
        int id_mat=0;
        try {
            PreparedStatement st = ConexionBD.getConexion().prepareStatement("SELECT max(id_materiaprima) from materiaprima;");
            ResultSet rs = st.executeQuery();
            if(rs.next()) id_mat = rs.getInt(1);
            System.out.println("id es: "+id_mat);
            st = ConexionBD.getConexion()
                    .prepareStatement("INSERT INTO Stock_Materia (Cantidad, ID_MateriaPrima_Proveida, ID_Deposito) VALUES (?,?,?)");
            st.setDouble(1,object.getCantidad());
            st.setInt(2,id_mat);
            st.setInt(3,0); // Esto porque el deposito es Unico
            st.executeUpdate();
            rs.close();
            st.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema");
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
        return null; //No Support yet
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
