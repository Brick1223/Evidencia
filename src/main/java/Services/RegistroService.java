
package Services;

import Modelos.Registro;

// Interfaz que define los métodos para el servicio de registro de usuarios
public interface RegistroService {
    
    /**
     * Método para registrar un nuevo usuario.
     * @param registro Objeto de tipo Registro que contiene los datos del usuario a registrar.
     */
    void registrarUsuario(Registro registro);
}


