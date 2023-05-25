
package creadortarjeta;

/**
 *
 * @author Default
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {

    public static Connection getConexion() {
        String url = "jdbc:sqlserver://localhost:1433;" + "databaseName=Register;";
        Connection con = null;
        ResultSet rs = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, "Generado", "hola12345");
            //System.out.println("**********Generador de Tarjetas**********");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No estable " + e.toString());
            return null;
        }

    }
}

