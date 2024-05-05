
package Services;

import Repositorios.RegistroRepository;
import Modelos.Registro;

import org.springframework.stereotype.Service;

// Implementación del servicio de registro de usuarios
@Service
public class RegistroServiceImpl implements RegistroService {

    private final RegistroRepository registroRepository;

    // Constructor que recibe el repositorio de registro como parámetro
    public RegistroServiceImpl(RegistroRepository registroRepository) {
        this.registroRepository = registroRepository;
    }

    /**
     * Método para registrar un nuevo usuario.
     * @param registro Objeto de tipo Registro que contiene los datos del usuario a registrar.
     */
    @Override
    public void registrarUsuario(Registro registro) {
        registroRepository.agregarRegistro(registro); // Agregar el registro al repositorio
    }
}

