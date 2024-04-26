package Controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import configuracion.conexionDB;

public class ControladorPedido {
    
    public static boolean registrarPedido(int idCliente, int idProducto, int cantidad) {
        Connection conexion = null;
        PreparedStatement statement = null;
        
        try {
            conexion = conexionDB.conectar();
            String consulta = "INSERT INTO pedidos (id_cliente, id_producto, cantidad) VALUES (?, ?, ?)";
            statement = conexion.prepareStatement(consulta);
            statement.setInt(1, idCliente);
            statement.setInt(2, idProducto);
            statement.setInt(3, cantidad);
            int filasInsertadas = statement.executeUpdate();
            
            return filasInsertadas > 0; // Devuelve true si se insertó al menos una fila
            
        } catch (SQLException e) {
            System.out.println("Error al registrar pedido: " + e.getMessage());
            return false;
        } finally {
            cerrarRecursos(null, statement, conexion);
        }
    }
    
    // Otros métodos para actualizar, eliminar, obtener pedidos, etc.
    
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

