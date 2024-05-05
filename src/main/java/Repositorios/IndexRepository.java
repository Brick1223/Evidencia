
package Repositorios;

import Modelos.Index;

public class IndexRepository {

    private Index index; // Objeto Index para almacenar los enlaces

    // Constructor que inicializa el objeto Index
    public IndexRepository() {
        this.index = new Index();
    }

    // Método para obtener el objeto Index
    public Index getIndex() {
        return index; // Devuelve el objeto Index
    }

    // Método para establecer el objeto Index
    public void setIndex(Index index) {
        this.index = index; // Establece el objeto Index con el valor proporcionado
    }
}
