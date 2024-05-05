package Controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Configuracion.conexionDB;

public class Usuario {
    
    // Método para autenticar un usuario en la base de datos
    public static boolean autenticarUsuario(String username, String password) {
        Connection conexion = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {
            // Establecer conexión con la base de datos
            conexion = conexionDB.conectar();
            // Consulta SQL para buscar un usuario con el nombre de usuario y contraseña proporcionados
            String consulta = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
            statement = conexion.prepareStatement(consulta);
            // Asignar los valores de los parámetros a la consulta SQL
            statement.setString(1, username);
            statement.setString(2, password);
            // Ejecutar la consulta y obtener el resultado
            resultSet = statement.executeQuery();
            
            // Devolver true si se encontró al menos un resultado (usuario válido)
            return resultSet.next();
            
        } catch (SQLException e) {
            // Manejar excepciones si ocurre un error al autenticar el usuario
            System.out.println("Error al autenticar usuario: " + e.getMessage());
            return false;
        } finally {
            // Cerrar recursos (resultSet, statement, conexión) para liberar memoria y evitar fugas de recursos
            cerrarRecursos(resultSet, statement, conexion);
        }
    }
    
    // Método para registrar un nuevo usuario en la base de datos
    public static boolean registrarUsuario(String username, String password) {
        Connection conexion = null;
        PreparedStatement statement = null;
        
        try {
            // Establecer conexión con la base de datos
            conexion = conexionDB.conectar();
            // Consulta SQL para insertar un nuevo usuario en la tabla 'usuarios'
            String consulta = "INSERT INTO usuarios (username, password) VALUES (?, ?)";
            statement = conexion.prepareStatement(consulta);
            // Asignar los valores de los parámetros a la consulta SQL
            statement.setString(1, username);
            statement.setString(2, password);
            // Ejecutar la consulta y obtener el número de filas afectadas
            int filasInsertadas = statement.executeUpdate();
            
            // Devolver true si se insertó al menos una fila correctamente
            return filasInsertadas > 0;
            
        } catch (SQLException e) {
            // Manejar excepciones si ocurre un error al registrar el usuario
            System.out.println("Error al registrar usuario: " + e.getMessage());
            return false;
        } finally {
            // Cerrar recursos (statement, conexión) para liberar memoria y evitar fugas de recursos
            cerrarRecursos(null, statement, conexion);
        }
    }
    
    // Método para actualizar la contraseña de un usuario en la base de datos
    public static boolean actualizarUsuario(String username, String nuevoPassword) {
        Connection conexion = null;
        PreparedStatement statement = null;
        
        try {
            // Establecer conexión con la base de datos
            conexion = conexionDB.conectar();
            // Consulta SQL para actualizar la contraseña de un usuario
            String consulta = "UPDATE usuarios SET password = ? WHERE username = ?";
            statement = conexion.prepareStatement(consulta);
            // Asignar los valores de los parámetros a la consulta SQL
            statement.setString(1, nuevoPassword);
            statement.setString(2, username);
            // Ejecutar la consulta y obtener el número de filas actualizadas
            int filasActualizadas = statement.executeUpdate();
            
            // Devolver true si se actualizó al menos una fila correctamente
            return filasActualizadas > 0;
            
        } catch (SQLException e) {
            // Manejar excepciones si ocurre un error al actualizar el usuario
            System.out.println("Error al actualizar usuario: " + e.getMessage());
            return false;
        } finally {
            // Cerrar recursos (statement, conexión) para liberar memoria y evitar fugas de recursos
            cerrarRecursos(null, statement, conexion);
        }
    }
    
    // Método para eliminar un usuario de la base de datos
    public static boolean eliminarUsuario(String username) {
        Connection conexion = null;
        PreparedStatement statement = null;
        
        try {
            // Establecer conexión con la base de datos
            conexion = conexionDB.conectar();
            // Consulta SQL para eliminar un usuario de la tabla 'usuarios'
            String consulta = "DELETE FROM usuarios WHERE username = ?";
            statement = conexion.prepareStatement(consulta);
            // Asignar el valor del parámetro a la consulta SQL
            statement.setString(1, username);
            // Ejecutar la consulta y obtener el número de filas eliminadas
            int filasEliminadas = statement.executeUpdate();
            
            // Devolver true si se eliminó al menos una fila correctamente
            return filasEliminadas > 0;
            
        } catch (SQLException e) {
            // Manejar excepciones si ocurre un error al eliminar el usuario
            System.out.println("Error al eliminar usuario: " + e.getMessage());
            return false;
        } finally {
            // Cerrar recursos (statement, conexión) para liberar memoria y evitar fugas de recursos
            cerrarRecursos(null, statement, conexion);
        }
    }
    
    // Método privado para cerrar recursos (ResultSet, PreparedStatement, Connection)
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



