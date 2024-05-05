package Controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Configuracion.conexionDB;

public class ControladorContabilidad {
    
    // Método para registrar un nuevo gasto en la base de datos
    public static boolean registrarGasto(String concepto, double monto) {
        Connection conexion = null;
        PreparedStatement statement = null;
        
        try {
            // Establecer conexión con la base de datos
            conexion = conexionDB.conectar();
            // Consulta SQL para insertar un nuevo gasto en la tabla 'gastos'
            String consulta = "INSERT INTO gastos (concepto, monto) VALUES (?, ?)";
            statement = conexion.prepareStatement(consulta);
            // Asignar los valores de los parámetros a la consulta SQL
            statement.setString(1, concepto);
            statement.setDouble(2, monto);
            // Ejecutar la consulta y obtener el número de filas afectadas
            int filasInsertadas = statement.executeUpdate();
            
            // Devolver true si se insertó al menos una fila
            return filasInsertadas > 0;
            
        } catch (SQLException e) {
            // Manejar excepciones si ocurre un error al registrar el gasto
            System.out.println("Error al registrar gasto: " + e.getMessage());
            return false;
        } finally {
            // Cerrar recursos (statement, conexión) para liberar memoria y evitar fugas de recursos
            cerrarRecursos(null, statement, conexion);
        }
    }
    
    // Método para actualizar un gasto existente en la base de datos
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
    
    // Método para eliminar un gasto existente en la base de datos
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
    
    // Método para obtener información de todos los gastos registrados en la base de datos
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
            
            // Iterar sobre el conjunto de resultados y agregar la información de cada gasto a la lista
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
