
package Modelos;

public class Index {

    private String gestionProduccionLink; // Enlace a la página de Gestión de Producción
    private String contabilidadLink; // Enlace a la página de Contabilidad
    private String servicioClienteLink; // Enlace a la página de Servicio al Cliente
    private String dashboardLink; // Enlace a la página de Dashboard

    /**
     * Obtiene el enlace a la página de Gestión de Producción.
     * @return El enlace a la página de Gestión de Producción.
     */
    public String getGestionProduccionLink() {
        return gestionProduccionLink;
    }

    /**
     * Establece el enlace a la página de Gestión de Producción.
     * @param gestionProduccionLink El nuevo enlace a la página de Gestión de Producción.
     */
    public void setGestionProduccionLink(String gestionProduccionLink) {
        this.gestionProduccionLink = gestionProduccionLink;
    }

    /**
     * Obtiene el enlace a la página de Contabilidad.
     * @return El enlace a la página de Contabilidad.
     */
    public String getContabilidadLink() {
        return contabilidadLink;
    }

    /**
     * Establece el enlace a la página de Contabilidad.
     * @param contabilidadLink El nuevo enlace a la página de Contabilidad.
     */
    public void setContabilidadLink(String contabilidadLink) {
        this.contabilidadLink = contabilidadLink;
    }

    /**
     * Obtiene el enlace a la página de Servicio al Cliente.
     * @return El enlace a la página de Servicio al Cliente.
     */
    public String getServicioClienteLink() {
        return servicioClienteLink;
    }

    /**
     * Establece el enlace a la página de Servicio al Cliente.
     * @param servicioClienteLink El nuevo enlace a la página de Servicio al Cliente.
     */
    public void setServicioClienteLink(String servicioClienteLink) {
        this.servicioClienteLink = servicioClienteLink;
    }

    /**
     * Obtiene el enlace a la página de Dashboard.
     * @return El enlace a la página de Dashboard.
     */
    public String getDashboardLink() {
        return dashboardLink;
    }

    /**
     * Establece el enlace a la página de Dashboard.
     * @param dashboardLink El nuevo enlace a la página de Dashboard.
     */
    public void setDashboardLink(String dashboardLink) {
        this.dashboardLink = dashboardLink;
    }
}
