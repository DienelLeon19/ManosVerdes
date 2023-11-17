    package manosverdes;
import Entidades.BaseDeDatos;
import java.sql.SQLException;

public class ManosVerdes {
    public static void main(String[] args) 
    {   
        try {
            String conexion = "jdbc:sqlserver://ManosVerde"
                    + ".mssql.somee.com:1433;databaseName=Manosverde;encrypt=false;";

            BaseDeDatos bd = new BaseDeDatos(conexion, "DaniFer_SQLLogin_1", "9yu942b6s5");

            FrameLogin Ref = new FrameLogin(bd);  // Pasa la instancia de BaseDeDatos a FrameLogin
            Ref.setLocationRelativeTo(Ref);
            Ref.setVisible(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
