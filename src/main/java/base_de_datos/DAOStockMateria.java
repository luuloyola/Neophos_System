package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import logico.StockMateria;

public class DAOStockMateria implements DAO<StockMateria>{

    public DAOStockMateria() {
    }
    
    @Override
    public void create(StockMateria object) throws Exception {
        int id_mat=0;
        try {
            ConexionBD.conectar();
            PreparedStatement st = ConexionBD.getConexion().prepareStatement("IDENT_CURRENT('MateriaPrima')");
            ResultSet rs = st.executeQuery();
            if(rs.next()) id_mat = rs.getInt(1);
            st = ConexionBD.getConexion()
                    .prepareStatement("INSERT INTO StockMateria (cantidad, id_materiaPrima, id_deposito) VALUES (?,?,?)");
            st.setInt(1,object.getCantidad());
            st.setInt(2,id_mat);
            st.setInt(3,0); // Esto porque el deposito es Unico
            
        } catch (Exception e) {
        }finally {ConexionBD.cerrar();}
        
    }

    @Override
    public void update(StockMateria object) throws Exception {
        //No Support yet
    }

    @Override
    public void delete(StockMateria object) throws Exception {
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
