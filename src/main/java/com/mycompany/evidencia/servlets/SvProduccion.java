package com.mycompany.evidencia.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GestionProduccionServlet")
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
        
        // Imprimir los parámetros del formulario recibidos
        System.out.println("Cantidad Producida 1: " + cantidadProducida);
        System.out.println("Cantidad Producida 2: " + cantidadProducida2);
        System.out.println("Cantidad Producida 3: " + cantidadProducida3);
        System.out.println("Producto 1: " + producto1);
        System.out.println("Producto 2: " + producto2);
        System.out.println("Producto 3: " + producto3);
        System.out.println("Descripción Producción 1: " + descripcionProduccion);
        System.out.println("Descripción Producción 2: " + descripcionProduccion2);
        System.out.println("Descripción Producción 3: " + descripcionProduccion3);
        
        // Aquí puedes realizar cualquier operación con los datos recibidos
        
        // Redirigir de vuelta a la página de gestión de producción o a donde desees
        response.sendRedirect("gestion_produccion.jsp");
    }
}

