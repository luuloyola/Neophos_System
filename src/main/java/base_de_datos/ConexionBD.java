package base_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.sql.SQLException;

public class ConexionBD {
    private static ConexionBD ConexionBD;
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
                         
                + "CREATE TABLE IF NOT EXISTS Proveedor("
                + "Nombre_Proveedor TEXT NOT NULL, "
                + "Telefono INTEGER NOT NULL, "
                + "Mail TEXT NOT NULL, "
                + "PRIMARY KEY (Nombre_Proveedor));"
                         
                + "CREATE TABLE IF NOT EXISTS MateriaPrima("
                + "Nombre_MateriaPrima TEXT NOT NULL, "
                + "Descripcion TEXT NOT NULL, "
                + "Tipo_Mat Tipo_Mat NOT NULL, " 
                + "Precio_Unidad FLOAT8 NOT NULL,"
                + "PRIMARY KEY (Nombre_MateriaPrima));"
                         
                + "CREATE TABLE IF NOT EXISTS Producto("
                + "Nombre_Producto TEXT NOT NULL, " 
                + "PRIMARY KEY (Nombre_Producto));"
                
                + "CREATE TABLE IF NOT EXISTS ProductoFinal("
                + "Nombre_Producto TEXT NOT NULL, "
                + "Descripcion TEXT NOT NULL, "
                + "Empaquetado Tipo_Empaquetado NOT NULL, "
                + "Precio FLOAT8 NOT NULL, "
                + "PRIMARY KEY (Nombre_Producto));"
                
                + "CREATE TABLE IF NOT EXISTS OrdenDeCompra("
                + "Fecha_Pedido DATE NOT NULL, "
                + "Precio_Total FLOAT8 NOT NULL, "
                + "Nombre_Proveedor_Tiene TEXT NOT NULL, "
                + "ID_OrdenDeCompra SERIAL, "                
                + "PRIMARY KEY (ID_OrdenDeCompra),"
                + "FOREIGN KEY (Nombre_Proveedor_Tiene) REFERENCES Proveedor (Nombre_Proveedor));"
                         
                + "CREATE TABLE IF NOT EXISTS Renglon_Compra("
                + "ID_Renglon SERIAL, "
                + "Cantidad FLOAT8 NOT NULL, "
                + "Precio FLOAT8 NOT NULL, "
                + "Nombre_Materia_Tiene TEXT NOT NULL, "
                + "ID_Orden_Corresponde INTEGER NOT NULL,"
                + "PRIMARY KEY (ID_Renglon),"
                + "FOREIGN KEY (Nombre_Materia_Tiene) REFERENCES Producto (Nombre_Producto),"
                + "FOREIGN KEY (ID_Orden_Corresponde) REFERENCES OrdenDeCompra (ID_OrdenDeCompra));"
                  
                + "CREATE TABLE IF NOT EXISTS OrdenDeProduccion("
                + "ID_OrdenDeProduccion SERIAL, "
                + "Fecha_Pedido DATE NOT NULL, "
                + "Fecha_Limite DATE NOT NULL, "
                + "Fecha_Realizacion DATE NULL, "
                + "Receta TEXT NULL, "         
                + "Precio_Total FLOAT8 NOT NULL, "
                + "PRIMARY KEY (ID_OrdenDeProduccion));"
                         
                + "CREATE TABLE IF NOT EXISTS Renglon_Produccion("
                + "ID_Renglon SERIAL, "
                + "Cantidad FLOAT8 NOT NULL, "
                + "Precio FLOAT8 NOT NULL, "
                + "Nombre_Producto_Tiene TEXT NOT NULL, "
                + "ID_Orden_Corresponde INTEGER NOT NULL,"
                + "PRIMARY KEY (ID_Renglon),"
                + "FOREIGN KEY (Nombre_Producto_Tiene) REFERENCES ProductoFinal (Nombre_Producto),"
                + "FOREIGN KEY (ID_Orden_Corresponde) REFERENCES OrdenDeProduccion (ID_OrdenDeProduccion));"
                        
                + "CREATE TABLE IF NOT EXISTS Provee("
                + "Nombre_Proveedor_Provee TEXT NOT NULL, "
                + "Nombre_MateriaPrima_Proveida TEXT NOT NULL, " 
                + "Precio FLOAT8 NOT NULL,"
                + "PRIMARY KEY (Nombre_Proveedor_Provee, Nombre_MateriaPrima_Proveida),"
                + "FOREIGN KEY (Nombre_MateriaPrima_Proveida) REFERENCES Producto (Nombre_Producto),"
                + "FOREIGN KEY (Nombre_Proveedor_Provee) REFERENCES Proveedor (Nombre_Proveedor));"
                
                + "CREATE TABLE IF NOT EXISTS Compuesto_Por("
                + "Nombre_Producto_Compuesto TEXT NOT NULL, "
                + "Nombre_MateriaPrima_Compuesta TEXT NOT NULL, "
                + "Cantidad_requerida INTEGER NOT NULL, "
                + "PRIMARY KEY (Nombre_Producto_Compuesto, Nombre_MateriaPrima_Compuesta),"
                + "FOREIGN KEY (Nombre_Producto_Compuesto) REFERENCES ProductoFinal (Nombre_Producto),"
                + "FOREIGN KEY (Nombre_MateriaPrima_Compuesta) REFERENCES MateriaPrima (Nombre_MateriaPrima));"
                
                + "CREATE TABLE IF NOT EXISTS Stock_Materia("
                + "ID_Deposito INTEGER NOT NULL, "
                + "Nombre_MateriaPrima_Proveida TEXT NOT NULL, "
                + "Cantidad FLOAT8 NOT NULL,"
                + "PRIMARY KEY (ID_Deposito, Nombre_MateriaPrima_Proveida),"
                + "FOREIGN KEY (Nombre_MateriaPrima_Proveida) REFERENCES MateriaPrima (Nombre_MateriaPrima));"
        
                
    );
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
    public static Connection getConexion() throws SQLException{
        if (ConexionBD == null)
            ConexionBD = new ConexionBD();
        
        conexion = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);

        return conexion;
    }
    
    public static ConexionBD getInstance() throws SQLException{
        if (ConexionBD == null)
            ConexionBD = new ConexionBD();

        return ConexionBD;
    }
}
