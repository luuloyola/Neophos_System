package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import logico.RenglonProduccion;
import logico.Renglon_Compra;
public class DAO_RenglonProduccion implements DAO<RenglonProduccion>{

    @Override
    public void create(RenglonProduccion object) throws Exception {
    }

    @Override
    public Object read(int id) throws Exception {
     return null;
    }

    @Override
    public void update(RenglonProduccion object, int id) throws Exception {
        
    }

    @Override
    public void delete(int id) throws Exception {
        
    }

    @Override
    public List<RenglonProduccion> findAll() throws Exception {
        return null;
    }

    @Override
    public Object consulta(int id) throws Exception {
        return null;
    }
    public List<RenglonProduccion> findAllDeOrden(int id) throws Exception {
        List<RenglonProduccion> listaRenglones = null;
        try {
            System.out.println("esta por hacer el select id orden corresponde en el dao renglon");
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM Renglon_Produccion WHERE ID_Orden_Corresponde = ?");
            st.setInt(1, id);
            listaRenglones = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            System.out.println("ya hizo el select id corresponde en dao renglon");
            while(rs.next()){
                RenglonProduccion renglon = new RenglonProduccion();
                renglon.setCantidad(rs.getDouble(2));
                renglon.setPrecio(rs.getDouble(3));
                renglon.setNombre_Tiene(rs.getString(4));
                listaRenglones.add(renglon);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
        return listaRenglones;
    }
    
}
