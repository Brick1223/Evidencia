
package Modelos;

public class Dashboard {

    private int totalUsuarios; // Total de usuarios registrados en el sistema
    private int totalProductos; // Total de productos disponibles en el sistema
    private int totalPedidos; // Total de pedidos realizados en el sistema

    /**
     * Obtiene el total de usuarios registrados en el sistema.
     * @return El total de usuarios registrados.
     */
    public int getTotalUsuarios() {
        return totalUsuarios;
    }

    /**
     * Establece el total de usuarios registrados en el sistema.
     * @param totalUsuarios El nuevo total de usuarios registrados.
     */
    public void setTotalUsuarios(int totalUsuarios) {
        this.totalUsuarios = totalUsuarios;
    }

    /**
     * Obtiene el total de productos disponibles en el sistema.
     * @return El total de productos disponibles.
     */
    public int getTotalProductos() {
        return totalProductos;
    }

    /**
     * Establece el total de productos disponibles en el sistema.
     * @param totalProductos El nuevo total de productos disponibles.
     */
    public void setTotalProductos(int totalProductos) {
        this.totalProductos = totalProductos;
    }

    /**
     * Obtiene el total de pedidos realizados en el sistema.
     * @return El total de pedidos realizados.
     */
    public int getTotalPedidos() {
        return totalPedidos;
    }

    /**
     * Establece el total de pedidos realizados en el sistema.
     * @param totalPedidos El nuevo total de pedidos realizados.
     */
    public void setTotalPedidos(int totalPedidos) {
        this.totalPedidos = totalPedidos;
    }

    // Otros campos relevantes para el dashboard
}
