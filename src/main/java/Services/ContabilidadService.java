
package Services;

import Modelos.Contabilidad;

import java.util.List;

public interface ContabilidadService {
    
    // Método para registrar un registro de contabilidad
    void registrarContabilidad(Contabilidad registroContabilidad);
    
    // Método para obtener todos los registros de contabilidad
    List<Contabilidad> obtenerRegistros();
}
