package com.mycompany.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Joao Conde, Victor Suquilanda, Josue Riera, Pablo Yanez
 */
public class Conexion {
    protected Connection conexion;
    private static final String URL = "jdbc:postgresql://localhost:5432/udla-db";
    private static final String USER = "joao";
    private static final String PASSWORD = "1234";

    public Connection conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar la base de datos: " + e.getMessage(), "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
        return conexion;
    }

    public void cerrar() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
    }
}
