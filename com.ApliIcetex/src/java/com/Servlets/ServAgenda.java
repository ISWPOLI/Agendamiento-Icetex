/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Servlets;


import com.Entid.Agenda;
import com.Session.AgendaFacade;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * declaracion del Servlet SerAgenda
 *
 *
 * @author Damage Control
 * @version 0.1.6
 */
public class ServAgenda extends HttpServlet {
    @EJB
    private AgendaFacade agendaFacade;

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
            out.println("<title>Servlet ServAgenda</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServAgenda at " + request.getContextPath() + "</h1>");
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
        disparcher = getServletContext().getRequestDispatcher("/Agenda.jsp");
        
         Agenda ag = new Agenda();
         
        HttpSession misesion = request.getSession();
        String corr =(String) misesion.getAttribute("correo");
        
        
        Collection<Agenda> agenda = agendaFacade.findAll();
        Agenda [] agencad = new Agenda[agenda.size()];
        int size =agenda.size();
        agenda.toArray(agencad);
        
        /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param agenda Crea una collecion de las agendas 
     * @param size es el tamaño total de la agenda 
     * 
     */
        
       
       
        
        request.setAttribute("tamaño", size);
        request.setAttribute("cadenagenda", agencad);
        request.setAttribute("correo", corr);
      
        
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
