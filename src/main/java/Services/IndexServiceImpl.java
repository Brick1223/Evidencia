
package Services;

import Repositorios.IndexRepository; // Importación del repositorio IndexRepository
import Modelos.Index; // Importación del modelo Index

public class IndexServiceImpl implements IndexService {

    private final IndexRepository indexRepository; // Instancia del repositorio IndexRepository

    public IndexServiceImpl(IndexRepository indexRepository) {
        this.indexRepository = indexRepository; // Inicialización del repositorio IndexRepository
    }

    @Override
    public Index obtenerIndex() {
        return indexRepository.getIndex(); // Retorna el Index obtenido desde el repositorio
    }
}

