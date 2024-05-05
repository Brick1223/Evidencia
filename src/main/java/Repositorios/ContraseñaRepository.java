
package Repositorios;

import Modelos.Contraseña;

public class ContraseñaRepository {
    private Contraseña contraseña; // Variable para almacenar la contraseña

    // Constructor
    public ContraseñaRepository() {
        this.contraseña = new Contraseña(); // Inicializa la contraseña como un nuevo objeto Contraseña
    }

    // Método para restablecer la contraseña
    public void restablecerContraseña(Contraseña contraseña) {
        // Aquí puedes implementar la lógica para restablecer la contraseña,
        // por ejemplo, enviar un correo electrónico de restablecimiento, actualizar en la base de datos, etc.
        this.contraseña = contraseña; // Asigna la nueva contraseña
    }

    // Método para obtener la contraseña
    public Contraseña obtenerContraseña() {
        return contraseña; // Devuelve la contraseña actual
    }
}
