package base_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {
    protected static Connection conexion;
    private static Statement query = null;
    
    private static final String DB_NAME = "Neophos";
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/" + DB_NAME;
    private static final String DB_USER = "postgres";
    private static final String DB_PWD = "admin";
    
    //protected static Connection conexion;
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; // org.postgresql.Driver
    private static final String BD_URL = "jdbc:mysql://localhost:3306/ejemplo"; // jdbc:postgresql://localhost:{puerto}/ejemplo
    
    private static final String USER = "root"; //Ese es el que yo tengo configurado
    private static final String PASS = "1234";
    
    //Aqui deberiamos crear las tablas si todavia no existen verdad??
    public ConexionBD() throws SQLException{
        conexion = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);

        query = conexion.createStatement();
        
        query.execute(
                "CREATE TYPE Tipo_Empaquetado AS ENUM ('TIRAS', 'SOBRES', 'PASTILLAS');"
                
                + "CREATE TYPE Tipo_Mat AS ENUM ('PRODUCTO_QUIMICO', 'INSUMO');"
                        
                + "CREATE TABLE IF NOT EXISTS MateriaPrima("
                + "ID_MateriaPrima INTEGER NOT NULL auto_increment, "
                + "Nombre TEXT NOT NULL, "
                + "Descripcion TEXT NOT NULL, "
                + "Tipo_Mat Tipo_Mat NOT NULL, " 
                + "Precio_Unidad DOUBLE NOT NULL, "
                + "PRIMARY KEY (ID_MateriaPrima)"
                
                + "CREATE TABLE IF NOT EXISTS ProductoFinal("
                + "ID_Producto INTEGER NOT NULL auto_increment, "
                + "Nombre TEXT NOT NULL, "
                + "Descripcion TEXT NOT NULL, "
                + "Empaquetado Tipo_Empaquetado NOT NULL, "
                + "Precio DOUBLE NOT NULL, "
                + "PRIMARY KEY (ID_Producto));"
                
                + "CREATE TABLE IF NOT EXISTS Proveedor("
                + "ID_Proveedor INTEGER NOT NULL auto_increment, "
                + "Telefono INTEGER NOT NULL, "
                + "Nombre TEXT NOT NULL, "
                + "Mail TEXT NOT NULL, "
                + "PRIMARY KEY (ID_Proveedor));"
                
                + "CREATE TABLE IF NOT EXISTS Renglon("
                + "ID_Renglon INTEGER NOT NULL auto_increment, "
                + "Cantidad DOUBLE NOT NULL, "
                + "Precio DOUBLE NOT NULL, "
                + "ID_Materia_Tiene INTEGER NOT NULL, "
                + "PRIMARY KEY (ID_Proveedor)"
                + "FOREIGN KEY (ID_Materia_Tiene) REFERENCES MateriaPrima (ID_Materia));"
                
                + "CREATE TABLE IF NOT EXISTS OrdenDeCompra("
                + "Fecha_Pedido DATE NOT NULL, "
                + "Precio_Total DOUBLE NOT NULL, "
                + "ID_Proveedor_Tiene INTEGER NOT NULL, "
                + "ID_OrdenDeCompra INTEGER NOT NULL auto_increment, "                
                + "PRIMARY KEY (ID_OrdenDeCompra)"
                + "FOREIGN KEY (ID_Proveedor_Tiene) REFERENCES Proveedor (ID_Proveedor));"
        
                + "CREATE TABLE IF NOT EXISTS Provee("
                + "ID_Proveedor_Provee INTEGER NOT NULL, "
                + "ID_MateriaPrima_Proveida INTEGER NOT NULL, "                
                + "PRIMARY KEY (ID_Proveedor_Provee, ID_MateriaPrima_Proveida)"
                + "FOREIGN KEY (ID_Proveedor_Tiene) REFERENCES Proveedor (ID_Proveedor));"
                + "FOREIGN KEY (ID_MateriaPrima_Proveida) REFERENCES MateriaPrima (ID_MateriaPrima));"
                
                + "CREATE TABLE IF NOT EXISTS Compuesto_Por("
                + "ID_Producto_Compuesto INTEGER NOT NULL, "
                + "ID_MateriaPrima_Compuesta INTEGER NOT NULL, "                
                + "PRIMARY KEY (ID_Producto_Compuesto, ID_MateriaPrima_Proveida)"
                + "FOREIGN KEY (ID_Producto_Compuesto) REFERENCES ProductoFinal (ID_Producto));"
                + "FOREIGN KEY (ID_MateriaPrima_Compuesta) REFERENCES MateriaPrima (ID_MateriaPrima));"
                
                /*
                + "CREATE TABLE IF NOT EXISTS Stock("
                + "ID_Deposito INTEGER NOT NULL, "
                + "ID_MateriaPrima_Proveida INTEGER NOT NULL, "
                + "Cantidad DOUBLE NOT NULL"                
                + "PRIMARY KEY (ID_Proveedor_Provee, ID_MateriaPrima_Proveida)"
                + "FOREIGN KEY (ID_Proveedor_Tiene) REFERENCES Proveedor (ID_Proveedor));"
                + "FOREIGN KEY (ID_MateriaPrima_Proveida) REFERENCES MateriaPrima (ID_MateriaPrima));"*/);
        
                // REVISAR CLASE STOCK, NO SABEMOS COMO SE HACE JEJE
    }
    
    public static void conectar() throws Exception{
        try {
            conexion = DriverManager.getConnection(BD_URL,USER,PASS);
            Class.forName(JDBC_DRIVER);
        } catch (Exception e) {
            throw e;
        }
    }
    public static void cerrar() throws SQLException{
        if(conexion!=null){
            if(!conexion.isClosed()){
                conexion.close();
            }
        }
    }
    public static Connection getConexion(){
        return conexion;
    }
    
}
