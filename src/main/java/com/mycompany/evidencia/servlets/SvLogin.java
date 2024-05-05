package com.mycompany.evidencia.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvLogin", urlPatterns = {"/SvLogin"})
public class SvLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener los parámetros del formulario
        String correo = request.getParameter("correo");
        String contrasena = request.getParameter("contrasena");

        // Verificar si los campos están vacíos
        if (correo == null || contrasena == null || correo.isEmpty() || contrasena.isEmpty()) {
            // Redirigir de nuevo a la página de inicio de sesión con un mensaje de error
            response.sendRedirect("Login.jsp?error=empty");
            return;
        }

        // Verificar si el correo tiene un formato válido
        if (!isValidEmailAddress(correo)) {
            // Redirigir de nuevo a la página de inicio de sesión con un mensaje de error
            response.sendRedirect("Login.jsp?error=invalid_email");
            return;
        }

        // Aquí deberías realizar la autenticación con una base de datos u otro sistema de almacenamiento seguro
        boolean autenticado = autenticarUsuario(correo, contrasena);

        if (autenticado) {
            // Redirigir al usuario al panel de control principal
            response.sendRedirect("dashboard.jsp");
        } else {
            // Redirigir de nuevo a la página de inicio de sesión con un mensaje de error
            response.sendRedirect("Login.jsp?error=invalid_credentials");
        }
    }

    // Método para verificar el formato del correo electrónico
    private boolean isValidEmailAddress(String email) {
        // Implementa la lógica de validación aquí, por ejemplo, utilizando expresiones regulares
        // Retorna true si el correo tiene un formato válido, de lo contrario, retorna false
        return true; // Solo para ejemplo
    }

    // Método para autenticar al usuario con un sistema de almacenamiento seguro
    private boolean autenticarUsuario(String correo, String contrasena) {
        // Implementa la lógica de autenticación aquí, por ejemplo, consultando una base de datos
        // Retorna true si el usuario está autenticado correctamente, de lo contrario, retorna false
        return false; // Solo para ejemplo
    }
}


