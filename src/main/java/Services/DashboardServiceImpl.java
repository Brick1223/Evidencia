
package Services;

import Modelos.Dashboard; // Importación del modelo Dashboard
import Repositorios.DashboardRepository; // Importación del repositorio DashboardRepository
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardServiceImpl implements DashboardService {

    private final DashboardRepository dashboardRepository; // Repositorio para acceder a los datos del dashboard

    @Autowired
    public DashboardServiceImpl(DashboardRepository dashboardRepository) {
        this.dashboardRepository = dashboardRepository; // Inyección de dependencias del repositorio DashboardRepository
    }

    @Override
    public Dashboard obtenerDatosDashboard() {
        return dashboardRepository.obtenerDatosDashboard(); // Obtiene los datos del dashboard desde el repositorio
    }
}


