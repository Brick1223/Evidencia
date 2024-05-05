
package Repositorios;

import Modelos.Registro; // Importa la clase Registro del paquete Modelos
import java.util.ArrayList;
import java.util.List;

public class RegistroRepository {
    private final List<Registro> registros; // Lista para almacenar registros de tipo Registro

    // Constructor para inicializar la lista de registros
    public RegistroRepository() {
        this.registros = new ArrayList<>(); // Inicializa la lista como un ArrayList vacío
    }

    // Método para agregar un registro a la lista
    public void agregarRegistro(Registro registro) {
        registros.add(registro); // Añade el registro proporcionado a la lista
    }

    // Método para obtener todos los registros
    public List<Registro> obtenerRegistros() {
        return registros; // Devuelve la lista de registros
    }
}
