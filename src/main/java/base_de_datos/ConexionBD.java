package base_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    protected Connection conexion;
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; // org.postgresql.Driver
    private final String BD_URL = "jdbc:mysql://localhost:3306/ejemplo"; // jdbc:postgresql://localhost:{puerto}/ejemplo
    
    private final String USER = "root"; //Ese es el que yo tengo configurado
    private final String PASS = "1234";
    
    //Aqui deberiamos crear las tablas si todavia no existen verdad??
    
    public void conectar() throws Exception{
        try {
            conexion = DriverManager.getConnection(BD_URL,USER,PASS);
            Class.forName(JDBC_DRIVER);
        } catch (Exception e) {
            throw e;
        }
    }
    public void cerrar() throws SQLException{
        if(conexion!=null){
            if(!conexion.isClosed()){
                conexion.close();
            }
        }
    }
    public Connection getConexion(){
        return conexion;
    }
    
}
