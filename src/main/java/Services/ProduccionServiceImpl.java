
package Services;

import org.springframework.stereotype.Service;

// Anotación que indica que esta clase es un componente de servicio gestionado por Spring
@Service
public class ProduccionServiceImpl implements ProduccionService {

    /**
     * Método para procesar la producción.
     * @param cantidad La cantidad de productos a producir.
     * @param descripcion La descripción del producto a producir.
     */
    @Override
    public void procesarProduccion(int cantidad, String descripcion) {
        // Aquí implementas la lógica para procesar la producción
        // Por ejemplo, guardar los datos en la base de datos, realizar cálculos, etc.
        System.out.println("Se procesó la producción: Cantidad = " + cantidad + ", Descripción = " + descripcion);
    }
}
