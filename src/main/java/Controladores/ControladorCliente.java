package Controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Configuracion.conexionDB;

public class ControladorCliente {
    
    // Método para registrar un nuevo cliente en la base de datos
    public static boolean registrarCliente(String nombre, String direccion, String telefono) {
        Connection conexion = null;
        PreparedStatement statement = null;
        
        try {
            // Establecer conexión con la base de datos
            conexion = conexionDB.conectar();
            // Consulta SQL para insertar un nuevo cliente en la tabla 'clientes'
            String consulta = "INSERT INTO clientes (nombre, direccion, telefono) VALUES (?, ?, ?)";
            statement = conexion.prepareStatement(consulta);
            // Asignar los valores de los parámetros a la consulta SQL
            statement.setString(1, nombre);
            statement.setString(2, direccion);
            statement.setString(3, telefono);
            // Ejecutar la consulta y obtener el número de filas afectadas
            int filasInsertadas = statement.executeUpdate();
            
            // Devolver true si se insertó al menos una fila
            return filasInsertadas > 0;
            
        } catch (SQLException e) {
            // Manejar excepciones si ocurre un error al registrar el cliente
            System.out.println("Error al registrar cliente: " + e.getMessage());
            return false;
        } finally {
            // Cerrar recursos (statement, conexión) para liberar memoria y evitar fugas de recursos
            cerrarRecursos(null, statement, conexion);
        }
    }
    
    // Otros métodos para actualizar, eliminar, obtener clientes, etc.
    
    // Método privado para cerrar recursos (ResultSet, PreparedStatement, Connection)
    private static void cerrarRecursos(ResultSet resultSet, PreparedStatement statement, Connection conexion) {
        try {
            // Cerrar el ResultSet si no es nulo
            if (resultSet != null) resultSet.close();
            // Cerrar el PreparedStatement si no es nulo
            if (statement != null) statement.close();
            // Cerrar la conexión si no es nula
            if (conexion != null) conexion.close();
        } catch (SQLException e) {
            // Manejar excepciones si ocurre un error al cerrar los recursos
            System.out.println("Error al cerrar recursos: " + e.getMessage());
        }
    }
}

