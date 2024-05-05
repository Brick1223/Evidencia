
package Services;

import Modelos.Contabilidad;
import Repositorios.ContabilidadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContabilidadServiceImpl implements ContabilidadService {

    // Repositorio de contabilidad que maneja la persistencia de los registros
    private final ContabilidadRepository contabilidadRepository;

    // Constructor que inyecta el repositorio de contabilidad
    @Autowired
    public ContabilidadServiceImpl(ContabilidadRepository contabilidadRepository) {
        this.contabilidadRepository = contabilidadRepository;
    }

    // Método para registrar un nuevo registro de contabilidad
    @Override
    public void registrarContabilidad(Contabilidad registroContabilidad) {
        contabilidadRepository.agregarRegistro(registroContabilidad);
    }

    // Método para obtener todos los registros de contabilidad
    @Override
    public List<Contabilidad> obtenerRegistros() {
        return contabilidadRepository.obtenerRegistros();
    }
}
