package configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionDB {
    // Configuración de la conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3305/proyectodb";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "luiscamargo1223";

    public static Connection conectar() throws SQLException {
        Connection conexion = null;
        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.jdbc.Driver");
            // Establecer la conexión
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("¡Conexión exitosa!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar el driver: " + ex.getMessage());
        }
        return conexion;
    }

    public static void desconectar(Connection conexion) throws SQLException {
        if (conexion != null && !conexion.isClosed()) {
            conexion.close();
            System.out.println("Conexión cerrada");
        }
    }
}

