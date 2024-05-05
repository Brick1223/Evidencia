
package Services;

import Repositorios.LoginRepository; // Importa el repositorio de login
import Modelos.Login; // Importa el modelo de login
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    private final LoginRepository loginRepository; // Repositorio de login

    @Autowired
    public LoginServiceImpl(LoginRepository loginRepository) {
        this.loginRepository = loginRepository; // Inyecta el repositorio de login mediante constructor
    }

    /**
     * Método para autenticar un usuario.
     * @param login El objeto Login que contiene el correo y la contraseña del usuario.
     * @return true si el usuario es autenticado con éxito, false de lo contrario.
     */
    @Override
    public boolean autenticarUsuario(Login login) {
        return loginRepository.autenticarUsuario(login); // Llama al método de autenticación en el repositorio de login
    }
}
