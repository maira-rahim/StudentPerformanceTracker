package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private static final String URL =
            "jdbc:mysql://reseau.proxy.rlwy.net:42118/railway";

    private static final String USER = "root";
    private static final String PASSWORD = "rLHRsuVaGtFpCmExIHLXwWNaEkVAObQu";

    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn =
                    DriverManager.getConnection(URL, USER, PASSWORD);

            return conn;

        } catch (Exception e) {
            System.out.println("DB Error: " + e.getMessage());
            return null;
        }
    }
}