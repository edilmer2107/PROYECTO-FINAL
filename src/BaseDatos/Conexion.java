    
package BaseDatos;

import java.sql.*;

public class Conexion {
    
    private static String url = "jdbc:mysql://localhost:3307/ejemplojava";
    private static String user = "root";
    private static String password = "";
    
    public static Connection conectar() throws SQLException{
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("CONEXION EXITOSA");
        } catch (SQLException e) {
            throw e;
        }
        return conexion;
    }
    
}