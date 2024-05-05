package com.mycompany.evidencia.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SvProduccion")
public class SvProduccion extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Obtener los parámetros del formulario
    String cantidadProducida = request.getParameter("cantidad_producida");
    String cantidadProducida2 = request.getParameter("cantidad_producida2");
    String cantidadProducida3 = request.getParameter("cantidad_producida3");
    String producto1 = request.getParameter("producto1");
    String producto2 = request.getParameter("producto2");
    String producto3 = request.getParameter("producto3");
    String descripcionProduccion = request.getParameter("descripcion_produccion");
    String descripcionProduccion2 = request.getParameter("descripcion_produccion2");
    String descripcionProduccion3 = request.getParameter("descripcion_produccion3");
    
    // Establecer atributos en el request para pasar los datos a la JSP
    request.setAttribute("cantidadProducida", cantidadProducida);
    request.setAttribute("cantidadProducida2", cantidadProducida2);
    request.setAttribute("cantidadProducida3", cantidadProducida3);
    request.setAttribute("producto1", producto1);
    request.setAttribute("producto2", producto2);
    request.setAttribute("producto3", producto3);
    request.setAttribute("descripcionProduccion", descripcionProduccion);
    request.setAttribute("descripcionProduccion2", descripcionProduccion2);
    request.setAttribute("descripcionProduccion3", descripcionProduccion3);

    // Redirigir de vuelta a la página de gestión de producción
    request.getRequestDispatcher("gestion_produccion.jsp").forward(request, response);
}

}


