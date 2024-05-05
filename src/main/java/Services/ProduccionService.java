package Services;

// Interfaz para definir el servicio relacionado con la producción
public interface ProduccionService {
    
    // Método para procesar la producción
    // Recibe la cantidad y la descripción del producto a producir
    void procesarProduccion(int cantidad, String descripcion);
}
