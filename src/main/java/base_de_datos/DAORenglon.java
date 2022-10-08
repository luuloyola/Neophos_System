/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base_de_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import logico.MateriaPrima;
import logico.Renglon;

/**
 *
 * @author Usuario
 */
public class DAORenglon implements DAO<Renglon>{

    ConexionBD conexion;

    @Override
    public void create(Renglon object) throws Exception {
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("INSERT INTO Renglon (ID_Renglon, Cantidad, Precio, ID_Materia_Tiene) VALUES (?,?,?,?)");
            st.setDouble(2, object.getCantidad());
            st.setDouble(3, object.getPrecio());
            st.setObject(4, object.getMateria());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
        
    }

    @Override
    public void delete(int id) throws Exception {
         try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("DELETE FROM Renglon where ID_Renglon = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
    }
    
     @Override
    public void update(Renglon object, int id) throws Exception {
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("UPDATE Renglon set Cantidad = ?, Precio = ?, ID_Materia_Tiene = ?, where ID_Renglon = ?");
            st.setDouble(1, object.getCantidad());
            st.setDouble(2, object.getPrecio());
            st.setObject(3, object.getMateria());
            st.setInt(4, id);
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
    }

    @Override
    public List<Renglon> findAll() throws Exception {
        List<Renglon> listaRenglones = null;
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("SELECT * FROM Renglon");
            listaRenglones = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Renglon renglon = new Renglon();
                renglon.setCantidad(rs.getDouble(2));
                renglon.setPrecio(rs.getDouble(3));
                renglon.setMateria((MateriaPrima) rs.getObject(4));
                listaRenglones.add(renglon);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
        return listaRenglones;
    }
    
    public Renglon consulta(int id) throws Exception {
        Renglon renglon = new Renglon();
        
        try {
            conexion.conectar();
            PreparedStatement st = conexion.getConexion()
                    .prepareStatement("SELECT * FROM Renglon WHERE ID_Renglon = ?");
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                renglon.setCantidad(rs.getDouble(2));
                renglon.setPrecio(rs.getDouble(3));
                renglon.setMateria((MateriaPrima) rs.getObject(4));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            conexion.cerrar();
        }
        return renglon;
    }

    @Override
    public Object read(int id) throws Exception {
        return null;
    }

    

}
