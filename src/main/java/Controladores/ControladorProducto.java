package Controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Configuracion.conexionDB;

public class ControladorProducto {
    
    // Método para registrar un nuevo producto en la base de datos
    public static boolean registrarProducto(String nombre, double precio) {
        Connection conexion = null;
        PreparedStatement statement = null;
        
        try {
            // Establecer conexión con la base de datos
            conexion = conexionDB.conectar();
            // Consulta SQL para insertar un nuevo producto en la tabla 'productos'
            String consulta = "INSERT INTO productos (nombre, precio) VALUES (?, ?)";
            statement = conexion.prepareStatement(consulta);
            // Asignar los valores de los parámetros a la consulta SQL
            statement.setString(1, nombre);
            statement.setDouble(2, precio);
            // Ejecutar la consulta y obtener el número de filas afectadas
            int filasInsertadas = statement.executeUpdate();
            
            // Devolver true si se insertó al menos una fila
            return filasInsertadas > 0;
            
        } catch (SQLException e) {
            // Manejar excepciones si ocurre un error al registrar el producto
            System.out.println("Error al registrar producto: " + e.getMessage());
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
