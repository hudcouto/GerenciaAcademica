package SistemaUniversitario;

/**
 *
 * @author hudson
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class Conecao {
    
    public Connection getConnection() throws ClassNotFoundException{
        
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            return DriverManager.getConnection("jdbc:mysql://104.236.63.244/gerencia_academica", "root", "hudson1810");
        }catch (SQLException e) {
         //throw new SQLException(e.getMessage());
           throw new RuntimeException(e);
      }
    }
}
