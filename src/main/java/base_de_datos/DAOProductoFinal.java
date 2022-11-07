package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import logico.ProductoFinal;

public class DAOProductoFinal implements DAO<ProductoFinal>{

    public DAOProductoFinal(){
    }
    
    
    @Override
    public void create(ProductoFinal object) throws Exception {
        // No Support yet
    }

    
    public ProductoFinal consulta(String nombre) throws Exception {
        ProductoFinal producto = new ProductoFinal();
        try {
            PreparedStatement st = ConexionBD.getConexion()
                    .prepareStatement("SELECT * FROM ProductoFinal WHERE Nombre_Producto = ?");
            st.setString(1, nombre);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                producto.setNombre_Producto(rs.getString(1));
                producto.setDescripcion(rs.getString(2));
                producto.setEmpaquetado(rs.getString(3));
                producto.setPrecio(rs.getDouble(4));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
        return producto;
    }

    @Override
    public ArrayList<ProductoFinal> findAll() throws Exception {
        ArrayList<ProductoFinal> listaProductoFinal = null;
        try {
            PreparedStatement st = ConexionBD.getConexion()
                        .prepareStatement("SELECT * FROM ProductoFinal");
            listaProductoFinal = new ArrayList<>();
            
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                ProductoFinal producto = new ProductoFinal();
                producto.setNombre_Producto(rs.getString(1));
                producto.setDescripcion(rs.getString(2));
                producto.setEmpaquetado(rs.getObject(3).toString());
                producto.setPrecio(rs.getDouble(4));
                listaProductoFinal.add(producto);
            }
            
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
        return listaProductoFinal;
    }

    public ArrayList<String> compuesto_por(String nombre) throws Exception{
        ArrayList<String> listaMateriaPrima = null;
        try {
            PreparedStatement st = ConexionBD.getConexion()
                        .prepareStatement("SELECT Nombre_MateriaPrima_Compuesta FROM Compuesto_Por WHERE Nombre_Producto_Compuesto = ?");
            st.setString(1, nombre);
            listaMateriaPrima = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                listaMateriaPrima.add(rs.getString(1));
            }
            
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            ConexionBD.cerrar();
        }
        return listaMateriaPrima;
    }
    
    @Override
    public Object read(int id) throws Exception {
        return null; //No Support yet
    }

    @Override
    public void update(ProductoFinal object, int id) throws Exception {
        //No Support yet
    }

    @Override
    public void delete(int id) throws Exception {
        //No Support yet
    }

    @Override
    public Object consulta(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}
