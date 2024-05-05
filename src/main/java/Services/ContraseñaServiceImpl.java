
package Services;

import Repositorios.ContraseñaRepository; // Importación del repositorio de contraseñas
import Modelos.Contraseña; // Importación del modelo de contraseña

// Implementación del servicio de gestión de contraseñas
public class ContraseñaServiceImpl implements ContraseñaService {

    private final ContraseñaRepository contraseñaRepository; // Repositorio de contraseñas

    // Constructor que recibe el repositorio de contraseñas como argumento
    public ContraseñaServiceImpl(ContraseñaRepository contraseñaRepository) {
        this.contraseñaRepository = contraseñaRepository; // Inicialización del repositorio
    }

    // Método para restablecer la contraseña del usuario dado su correo electrónico
    @Override
    public void restablecerContraseña(String correo) {
        // Aquí se puede implementar la lógica para restablecer la contraseña
        // Por ejemplo, enviar un correo electrónico de restablecimiento, actualizar en la base de datos, etc.
        
        // Se crea un objeto Contraseña con el correo proporcionado
        Contraseña contraseña = new Contraseña();
        contraseña.setCorreo(correo); // Se establece el correo electrónico
        
        // Se llama al método del repositorio para restablecer la contraseña
        contraseñaRepository.restablecerContraseña(contraseña);
    }
}

