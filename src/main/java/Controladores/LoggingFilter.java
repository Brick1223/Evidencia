package Controladores;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class LoggingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Inicialización del filtro (opcional)
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // Aquí puedes realizar cualquier tarea de filtrado antes de pasar la solicitud al servlet
        System.out.println("Filtro: Antes de pasar la solicitud al servlet");

        // Pasa la solicitud al siguiente filtro o al servlet
        chain.doFilter(request, response);

        // Aquí puedes realizar cualquier tarea de filtrado después de que el servlet haya sido ejecutado
        System.out.println("Filtro: Después de que el servlet haya sido ejecutado");
    }

    @Override
    public void destroy() {
        // Limpieza del filtro (opcional)
    }
}


