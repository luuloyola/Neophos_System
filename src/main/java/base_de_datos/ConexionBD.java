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
    
    public ConexionBD() throws SQLException{
        conexion = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);

        query = conexion.createStatement();
        
        query.execute(
                 "DO $$"
                + "BEGIN"
                + "  CREATE TYPE Tipo_Mat AS ENUM ('PRODUCTO_QUIMICO', 'INSUMO');"
                + "EXCEPTION"
                + "   WHEN duplicate_object THEN null;"
                + "END $$;"
                         
                + "DO $$"
                + "BEGIN"
                + "  CREATE TYPE Tipo_Empaquetado AS ENUM ('TIRAS', 'SOBRES', 'PASTILLAS');"
                + "EXCEPTION"
                + "   WHEN duplicate_object THEN null;"
                + "END $$;"
                         
                + "CREATE TABLE IF NOT EXISTS MateriaPrima("
                + "ID_MateriaPrima SERIAL, "
                + "Nombre TEXT NOT NULL, "
                + "Descripcion TEXT NOT NULL, "
                + "Tipo_Mat Tipo_Mat NOT NULL, " 
                + "Precio_Unidad FLOAT8 NOT NULL, "
                + "PRIMARY KEY (ID_MateriaPrima));"
                
                + "CREATE TABLE IF NOT EXISTS ProductoFinal("
                + "ID_Producto SERIAL, "
                + "Nombre TEXT NOT NULL, "
                + "Descripcion TEXT NOT NULL, "
                + "Empaquetado Tipo_Empaquetado NOT NULL, "
                + "Precio FLOAT8 NOT NULL, "
                + "PRIMARY KEY (ID_Producto));"
                
                + "CREATE TABLE IF NOT EXISTS Proveedor("
                + "ID_Proveedor SERIAL, "
                + "Telefono INTEGER NOT NULL, "
                + "Nombre TEXT NOT NULL, "
                + "Mail TEXT NOT NULL, "
                + "PRIMARY KEY (ID_Proveedor));"
                
                + "CREATE TABLE IF NOT EXISTS Renglon("
                + "ID_Renglon SERIAL, "
                + "Cantidad FLOAT8 NOT NULL, "
                + "Precio FLOAT8 NOT NULL, "
                + "ID_Materia_Tiene INTEGER NOT NULL, "
                + "PRIMARY KEY (ID_Renglon),"
                + "FOREIGN KEY (ID_Materia_Tiene) REFERENCES MateriaPrima (ID_MateriaPrima));"
                
                + "CREATE TABLE IF NOT EXISTS OrdenDeCompra("
                + "Fecha_Pedido DATE NOT NULL, "
                + "Precio_Total FLOAT8 NOT NULL, "
                + "ID_Proveedor_Tiene INTEGER NOT NULL, "
                + "ID_OrdenDeCompra SERIAL, "                
                + "PRIMARY KEY (ID_OrdenDeCompra),"
                + "FOREIGN KEY (ID_Proveedor_Tiene) REFERENCES Proveedor (ID_Proveedor));"
        
                + "CREATE TABLE IF NOT EXISTS Provee("
                + "ID_Proveedor_Provee INTEGER NOT NULL, "
                + "ID_MateriaPrima_Proveida INTEGER NOT NULL, "                
                + "PRIMARY KEY (ID_Proveedor_Provee, ID_MateriaPrima_Proveida),"
                + "FOREIGN KEY (ID_Proveedor_Provee) REFERENCES Proveedor (ID_Proveedor),"
                + "FOREIGN KEY (ID_MateriaPrima_Proveida) REFERENCES MateriaPrima (ID_MateriaPrima));"
                
                + "CREATE TABLE IF NOT EXISTS Compuesto_Por("
                + "ID_Producto_Compuesto INTEGER NOT NULL, "
                + "ID_MateriaPrima_Compuesta INTEGER NOT NULL, "                
                + "PRIMARY KEY (ID_Producto_Compuesto, ID_MateriaPrima_Compuesta),"
                + "FOREIGN KEY (ID_Producto_Compuesto) REFERENCES ProductoFinal (ID_Producto),"
                + "FOREIGN KEY (ID_MateriaPrima_Compuesta) REFERENCES MateriaPrima (ID_MateriaPrima));"
                
                + "CREATE TABLE IF NOT EXISTS Stock_Materia("
                + "ID_Deposito INTEGER NOT NULL, "
                + "ID_MateriaPrima_Proveida INTEGER NOT NULL, "
                + "Cantidad FLOAT8 NOT NULL,"
                + "PRIMARY KEY (ID_Deposito, ID_MateriaPrima_Proveida),"
                + "FOREIGN KEY (ID_MateriaPrima_Proveida) REFERENCES MateriaPrima (ID_MateriaPrima));");
    }
    
    public static void conectar() throws Exception{
        conexion = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
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
