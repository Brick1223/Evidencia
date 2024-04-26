package Controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import configuracion.conexionDB;

public class ControladorCliente {
    
    public static boolean registrarCliente(String nombre, String direccion, String telefono) {
        Connection conexion = null;
        PreparedStatement statement = null;
        
        try {
            conexion = conexionDB.conectar();
            String consulta = "INSERT INTO clientes (nombre, direccion, telefono) VALUES (?, ?, ?)";
            statement = conexion.prepareStatement(consulta);
            statement.setString(1, nombre);
            statement.setString(2, direccion);
            statement.setString(3, telefono);
            int filasInsertadas = statement.executeUpdate();
            
            return filasInsertadas > 0; // Devuelve true si se insertó al menos una fila
            
        } catch (SQLException e) {
            System.out.println("Error al registrar cliente: " + e.getMessage());
            return false;
        } finally {
            cerrarRecursos(null, statement, conexion);
        }
    }
    
    // Otros métodos para actualizar, eliminar, obtener clientes, etc.
    
    private static void cerrarRecursos(ResultSet resultSet, PreparedStatement statement, Connection conexion) {
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (conexion != null) conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar recursos: " + e.getMessage());
        }
    }
}

