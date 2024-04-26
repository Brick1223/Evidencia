
package com.mycompany.evidencia.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SvContraseña")
public class SvContraseña extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener el parámetro del formulario
        String correo = request.getParameter("correo");
        
        System.out.println("Correo es: " + correo);
        // Aquí puedes realizar cualquier operación con el correo electrónico
        
        // Redirigir a la página de dashboard o a donde desees
        response.sendRedirect("dashboard.jsp");
    }
}
