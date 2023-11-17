package Entidades;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDeDatos {

    private Connection conexion;

    public BaseDeDatos(String url, String usuario, String contraseña) throws SQLException {
        try 
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            this.conexion = DriverManager.getConnection(url, usuario, contraseña);
        } catch (ClassNotFoundException | SQLException ex) {
           
        }
    }

    public Connection obtenerConexion() {
        return this.conexion;
    }

    public void cerrarConexion() {
        try {
            if (this.conexion != null && !this.conexion.isClosed()) {
                this.conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}