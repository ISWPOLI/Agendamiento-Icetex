/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Servlets;

import com.Entid.Agenda;
import com.Session.AgendaFacade;
import com.ejb.Mailsenderbean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Willy
 */
public class Agendafinal extends HttpServlet {

    @EJB
    private AgendaFacade agendaFacade;
    @EJB
    private Mailsenderbean mailSender;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Agendafinal</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Agendafinal at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher disparcher;
        disparcher = getServletContext().getRequestDispatcher("/RegisAgenda.jsp");
        String texto = request.getParameter("texto");

        HttpSession misesion = request.getSession();
        String corr = (String) misesion.getAttribute("correo");

        String toEmail = corr;
        String subjet = "Agenda Icetex";
        String message = "Se realizó con éxito tu agenda, recuerda que las cancelaciones se realizan 24 horas antes de tu agenda asignada " +" ---- "+ texto;

        String fromEmail = "aplicetex@gmail.com";
        String username = "aplicetex";
        String pass = "Apex147258";

        StringTokenizer st = new StringTokenizer(texto);
        String hora;
        int id = 0;

        hora = st.nextElement().toString();

        id = Integer.parseInt(hora);

        Agenda ag = agendaFacade.find(id);

        hora = ag.getTipo();

        agendaFacade.remove(ag);

        request.setAttribute("texagend", texto);
        request.setAttribute("correo", corr);

        mailSender.sendEmail(fromEmail, username, pass, toEmail, subjet, message);

        disparcher.forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
