package com.libros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:h2:./data/restauranteDB";
    private static final String USER = "alejandro";
    private static final String PASSWORD = "4112";

    public static Connection conectar() throws SQLException {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("No se encontró el Driver de H2: " + e.getMessage());
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}