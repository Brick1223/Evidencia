package com.mycompany.evidencia.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvContabilidad", urlPatterns = {"/SvContabilidad"})
public class SvContabilidad extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Puedes manejar las solicitudes GET aquí si es necesario
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Puedes manejar las solicitudes POST aquí
        String concepto = request.getParameter("concepto");
        String monto = request.getParameter("monto");

      System.out.println("Concepto es: " + concepto);
        System.out.println("Monto es: " + monto);
    }
}
