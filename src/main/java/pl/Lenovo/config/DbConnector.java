package pl.Lenovo.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
    Connection connectionName = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/projekt_koncowy?useSSL=false&characterEncoding=utf8&serverTimezone=UTC",
            "Dawid",
            "root");

    public DbConnector() throws SQLException {
    }
}
