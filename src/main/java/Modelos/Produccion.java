
package Modelos;

public class Produccion {
    private int id; // Identificador único de la producción
    private int cantidadProducida; // Cantidad de productos producidos
    private String producto; // Descripción del producto producido

    // Constructor
    public Produccion(int id, int cantidadProducida, String producto) {
        this.id = id;
        this.cantidadProducida = cantidadProducida;
        this.producto = producto;
    }

    // Getters y setters

    /**
     * Obtiene el identificador único de la producción.
     * @return El identificador único de la producción.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único de la producción.
     * @param id El nuevo identificador único de la producción.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la cantidad de productos producidos.
     * @return La cantidad de productos producidos.
     */
    public int getCantidadProducida() {
        return cantidadProducida;
    }

    /**
     * Establece la cantidad de productos producidos.
     * @param cantidadProducida La nueva cantidad de productos producidos.
     */
    public void setCantidadProducida(int cantidadProducida) {
        this.cantidadProducida = cantidadProducida;
    }

    /**
     * Obtiene la descripción del producto producido.
     * @return La descripción del producto producido.
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Establece la descripción del producto producido.
     * @param producto La nueva descripción del producto producido.
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }
}
