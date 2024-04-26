package Controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import configuracion.conexionDB;

public class ControladorContabilidad {
    
    public static boolean registrarGasto(String concepto, double monto) {
        Connection conexion = null;
        PreparedStatement statement = null;
        
        try {
            conexion = conexionDB.conectar();
            String consulta = "INSERT INTO gastos (concepto, monto) VALUES (?, ?)";
            statement = conexion.prepareStatement(consulta);
            statement.setString(1, concepto);
            statement.setDouble(2, monto);
            int filasInsertadas = statement.executeUpdate();
            
            return filasInsertadas > 0; // Devuelve true si se insertó al menos una fila
            
        } catch (SQLException e) {
            System.out.println("Error al registrar gasto: " + e.getMessage());
            return false;
        } finally {
            cerrarRecursos(null, statement, conexion);
        }
    }
    
    public static boolean actualizarGasto(int idGasto, String nuevoConcepto, double nuevoMonto) {
        Connection conexion = null;
        PreparedStatement statement = null;
        
        try {
            conexion = conexionDB.conectar();
            String consulta = "UPDATE gastos SET concepto = ?, monto = ? WHERE id = ?";
            statement = conexion.prepareStatement(consulta);
            statement.setString(1, nuevoConcepto);
            statement.setDouble(2, nuevoMonto);
            statement.setInt(3, idGasto);
            int filasActualizadas = statement.executeUpdate();
            
            return filasActualizadas > 0; // Devuelve true si se actualizaron al menos una fila
            
        } catch (SQLException e) {
            System.out.println("Error al actualizar gasto: " + e.getMessage());
            return false;
        } finally {
            cerrarRecursos(null, statement, conexion);
        }
    }
    
    public static boolean eliminarGasto(int idGasto) {
        Connection conexion = null;
        PreparedStatement statement = null;
        
        try {
            conexion = conexionDB.conectar();
            String consulta = "DELETE FROM gastos WHERE id = ?";
            statement = conexion.prepareStatement(consulta);
            statement.setInt(1, idGasto);
            int filasEliminadas = statement.executeUpdate();
            
            return filasEliminadas > 0; // Devuelve true si se eliminó al menos una fila
            
        } catch (SQLException e) {
            System.out.println("Error al eliminar gasto: " + e.getMessage());
            return false;
        } finally {
            cerrarRecursos(null, statement, conexion);
        }
    }
    
    public static List<String> obtenerInformacionGastos() {
        List<String> listaGastos = new ArrayList<>();
        Connection conexion = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {
            conexion = conexionDB.conectar();
            String consulta = "SELECT * FROM gastos";
            statement = conexion.prepareStatement(consulta);
            resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String concepto = resultSet.getString("concepto");
                double monto = resultSet.getDouble("monto");
                
                String informacionGasto = "ID: " + id + ", Concepto: " + concepto + ", Monto: " + monto;
                listaGastos.add(informacionGasto);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener información de gastos: " + e.getMessage());
        } finally {
            cerrarRecursos(resultSet, statement, conexion);
        }
        
        return listaGastos;
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

