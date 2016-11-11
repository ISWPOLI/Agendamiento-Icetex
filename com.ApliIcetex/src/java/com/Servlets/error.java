/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;


/**
 * declaracion de la Servlet ServLogin
 *
 *
 * @author Damage Control
 * @version 0.1.6
 */

// Extencion del servlet 
public class error extends HttpServlet {

    // Method to handle GET method request.
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        // Analyze the servlet exception       
        Throwable throwable = (Throwable) request.getAttribute("java.lang.NullPointerException");
        Integer statusCode = (Integer) request.getAttribute("java.lang.NullPointerException.status_code");
        String servletName = (String) request.getAttribute("java.lang.NullPointerException.servlet_name");
        if (servletName == null) {
            servletName = "Unknown";
        }
        String requestUri = (String) request.getAttribute("javax.servlet.error.request_uri");
        if (requestUri == null) {
            requestUri = "Unknown";
        }

        // Set response content type
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "Error";
        String docType
                = "<!doctype html public \"-//w3c//dtd html 4.0 "
                + "transitional//en\">\n";
        out.println(docType
                + "<html>\n"
                + "<head><title>" + title + "</title></head>\n"
                + "<body bgcolor=\"#FDFCFB\">\n");

        if (throwable == null && statusCode == null) {
            out.println(" <h1 align= center><font face=arial size=15 color=#CECCCE>Su número de identidad ya existe o ingreso un dato de forma errónea por favor verifique </h></font>");
            out.println("<h3><font size =6 color=#DC0598>Regresar a pagina inicial </h3> <a href=\""
                    + response.encodeURL("http://localhost:8083/com.ApliIcetex/Login.jsp")+ "\">Login</a>.");
        } else if (statusCode != null) {
            out.println("el codigo es  : " + statusCode);
            
            
        } else {
            out.println("<h2>Error information</h2>");
            out.println("Servlet Name : " + servletName
                    + "</br></br>");
            out.println("Exception Type : "
                    + throwable.getClass().getName()
                    + "</br></br>");
            out.println("The request URI: " + requestUri
                    + "<br><br>");
            out.println("The exception message: "
                    + throwable.getMessage());
        }
        out.println("</body>");
        out.println("</html>");
    }

    // Method to handle POST method request.

    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}

