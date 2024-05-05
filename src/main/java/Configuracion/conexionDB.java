
package Configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionDB {
    // Configuración de la conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3305/proyectodb"; // URL de la base de datos
    private static final String USUARIO = "root"; // Nombre de usuario de la base de datos
    private static final String CONTRASENA = "luiscamargo1223"; // Contraseña de la base de datos

    // Método para establecer una conexión a la base de datos
    public static Connection conectar() throws SQLException {
        Connection conexion = null;
        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.jdbc.Driver");
            // Establecer la conexión utilizando la URL, usuario y contraseña especificados
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("¡Conexión exitosa!"); // Mensaje de éxito en la conexión
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar el driver: " + ex.getMessage()); // Manejo de excepciones si el driver no puede cargarse
        }
        return conexion; // Devolver la conexión establecida
    }

    // Método para cerrar la conexión a la base de datos
    public static void desconectar(Connection conexion) throws SQLException {
        if (conexion != null && !conexion.isClosed()) {
            conexion.close(); // Cerrar la conexión si está abierta
            System.out.println("Conexión cerrada"); // Mensaje indicando que la conexión ha sido cerrada
        }
    }
}
