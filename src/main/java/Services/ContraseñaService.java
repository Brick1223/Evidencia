
package Services;

// Interfaz para el servicio de gestión de contraseñas
public interface ContraseñaService {
    
    // Método para restablecer la contraseña de un usuario dado su correo electrónico
    void restablecerContraseña(String correo);
}
