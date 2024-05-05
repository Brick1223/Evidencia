
package Repositorios;

import Modelos.Produccion;
import java.util.ArrayList;
import java.util.List;

public class ProduccionRepository {
    // Simulación de una base de datos
    private final List<Produccion> producciones;

    // Constructor
    public ProduccionRepository() {
        this.producciones = new ArrayList<>();
    }

    // Método para agregar una producción
    public void agregarProduccion(Produccion produccion) {
        this.producciones.add(produccion);
    }

    // Método para obtener todas las producciones
    public List<Produccion> obtenerTodasLasProducciones() {
        return new ArrayList<>(this.producciones);
    }
}

