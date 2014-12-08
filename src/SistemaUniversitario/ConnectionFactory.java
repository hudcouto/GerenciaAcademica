package SistemaUniversitario;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Santos
 */
public class ConnectionFactory {
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            return DriverManager.getConnection(
          "jdbc:mysql:endereco_do_db", "user", "senha");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
