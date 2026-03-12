package com.spring.example.Util;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Component
public class DBconnection {
    private static final String url =
            "jdbc:postgresql://localhost:5432/HospitalManagement";

    private static final String userName = "postgres";
    private static final String password = "123";

    public Connection getConnection() throws SQLException {

        Connection connection = DriverManager.getConnection(url, userName, password);

        if (connection != null) {
            System.out.println("Database connected successfully");
        }

        return connection;
    }
}