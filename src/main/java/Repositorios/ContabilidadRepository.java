
package Repositorios;

import Modelos.Contabilidad;

import java.util.ArrayList;
import java.util.List;

public class ContabilidadRepository {
    private final List<Contabilidad> registros; // Lista que contiene los registros de contabilidad

    // Constructor
    public ContabilidadRepository() {
        this.registros = new ArrayList<>(); // Inicializa la lista de registros como una nueva lista vacía
    }

    // Método para agregar un nuevo registro de contabilidad a la lista
    public void agregarRegistro(Contabilidad registro) {
        registros.add(registro); // Agrega el registro especificado a la lista de registros
    }

    // Método para obtener todos los registros de contabilidad
    public List<Contabilidad> obtenerRegistros() {
        return registros; // Devuelve la lista de registros de contabilidad
    }
}
