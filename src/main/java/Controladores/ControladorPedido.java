package Controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Configuracion.conexionDB;

public class ControladorPedido {
    
    // Método para registrar un nuevo pedido en la base de datos
    public static boolean registrarPedido(int idCliente, int idProducto, int cantidad) {
        Connection conexion = null;
        PreparedStatement statement = null;
        
        try {
            // Establecer conexión con la base de datos
            conexion = conexionDB.conectar();
            // Consulta SQL para insertar un nuevo pedido en la tabla 'pedidos'
            String consulta = "INSERT INTO pedidos (id_cliente, id_producto, cantidad) VALUES (?, ?, ?)";
            statement = conexion.prepareStatement(consulta);
            // Asignar los valores de los parámetros a la consulta SQL
            statement.setInt(1, idCliente);
            statement.setInt(2, idProducto);
            statement.setInt(3, cantidad);
            // Ejecutar la consulta y obtener el número de filas afectadas
            int filasInsertadas = statement.executeUpdate();
            
            // Devolver true si se insertó al menos una fila
            return filasInsertadas > 0;
            
        } catch (SQLException e) {
            // Manejar excepciones si ocurre un error al registrar el pedido
            System.out.println("Error al registrar pedido: " + e.getMessage());
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
