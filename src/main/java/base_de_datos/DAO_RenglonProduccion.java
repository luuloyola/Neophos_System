package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import logico.RenglonProduccion;
public class DAO_RenglonProduccion implements DAO<RenglonProduccion>{

    @Override
    public void create(RenglonProduccion object) throws Exception {
        int id_Orden = 0;
        try {
            PreparedStatement st = ConexionBD.getConexion().prepareStatement("SELECT max(ID_OrdenDeProduccion) from OrdenDeProduccion;");
            ResultSet rs = st.executeQuery();
            if(rs.next()) id_Orden = rs.getInt(1);
            st = ConexionBD.getConexion()
                    .prepareStatement("INSERT INTO Renglon_Produccion (Cantidad, Precio, Nombre_Producto_Tiene, ID_Orden_Corresponde) VALUES (?,?,?,?)");
            st.setDouble(1, object.getCantidad());
            st.setDouble(2, object.getPrecio());
            st.setObject(3, object.getNombre_Tiene());
            st.setInt(4, id_Orden);
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
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
            
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM Renglon_Produccion WHERE ID_Orden_Corresponde = ?");
            st.setInt(1, id);
            listaRenglones = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            
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
