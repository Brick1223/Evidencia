package Controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import configuracion.conexionDB;

public class Usuario {
    
    public static boolean autenticarUsuario(String username, String password) {
        Connection conexion = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {
            conexion = conexionDB.conectar();
            String consulta = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
            statement = conexion.prepareStatement(consulta);
            statement.setString(1, username);
            statement.setString(2, password);
            resultSet = statement.executeQuery();
            
            return resultSet.next(); // Devuelve true si el usuario existe y las credenciales son correctas
            
        } catch (SQLException e) {
            System.out.println("Error al autenticar usuario: " + e.getMessage());
            return false;
        } finally {
            cerrarRecursos(resultSet, statement, conexion);
        }
    }
    
    public static boolean registrarUsuario(String username, String password) {
        Connection conexion = null;
        PreparedStatement statement = null;
        
        try {
            conexion = conexionDB.conectar();
            String consulta = "INSERT INTO usuarios (username, password) VALUES (?, ?)";
            statement = conexion.prepareStatement(consulta);
            statement.setString(1, username);
            statement.setString(2, password);
            int filasInsertadas = statement.executeUpdate();
            
            return filasInsertadas > 0; // Devuelve true si se insertó al menos una fila
            
        } catch (SQLException e) {
            System.out.println("Error al registrar usuario: " + e.getMessage());
            return false;
        } finally {
            cerrarRecursos(null, statement, conexion);
        }
    }
    
    public static boolean actualizarUsuario(String username, String nuevoPassword) {
        Connection conexion = null;
        PreparedStatement statement = null;
        
        try {
            conexion = conexionDB.conectar();
            String consulta = "UPDATE usuarios SET password = ? WHERE username = ?";
            statement = conexion.prepareStatement(consulta);
            statement.setString(1, nuevoPassword);
            statement.setString(2, username);
            int filasActualizadas = statement.executeUpdate();
            
            return filasActualizadas > 0; // Devuelve true si se actualizaron al menos una fila
            
        } catch (SQLException e) {
            System.out.println("Error al actualizar usuario: " + e.getMessage());
            return false;
        } finally {
            cerrarRecursos(null, statement, conexion);
        }
    }
    
    public static boolean eliminarUsuario(String username) {
        Connection conexion = null;
        PreparedStatement statement = null;
        
        try {
            conexion = conexionDB.conectar();
            String consulta = "DELETE FROM usuarios WHERE username = ?";
            statement = conexion.prepareStatement(consulta);
            statement.setString(1, username);
            int filasEliminadas = statement.executeUpdate();
            
            return filasEliminadas > 0; // Devuelve true si se eliminó al menos una fila
            
        } catch (SQLException e) {
            System.out.println("Error al eliminar usuario: " + e.getMessage());
            return false;
        } finally {
            cerrarRecursos(null, statement, conexion);
        }
    }
    
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



