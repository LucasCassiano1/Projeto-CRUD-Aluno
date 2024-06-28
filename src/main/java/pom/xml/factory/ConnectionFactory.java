package pom.xml.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Cadastro","root","1234");
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}