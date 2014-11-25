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
            return DriverManager.getConnection(
          "jdbc:mysql://104.236.63.244/gerencia_academica", "root", "hudson1810");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean getConnectionBoolean() {
        try {
            DriverManager.getConnection(
          "jdbc:mysql://104.236.63.244/gerencia_academica", "root", "hudson1810");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}