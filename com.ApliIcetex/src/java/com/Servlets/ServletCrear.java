/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Servlets;


import com.Entid.Correo;
import com.Entid.Seguridad;
import com.Entid.Usuario;
import com.Session.AgendaFacade;
import com.Session.CorreoFacade;
import com.Session.SeguridadFacade;
import com.Session.UsuarioFacade;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * declaracion de la Servlet ServLogin
 *
 *
 * @author Damage Control
 * @version 0.1.6
 */
public class ServletCrear extends HttpServlet {

    @EJB
    private UsuarioFacade usuarioFacade;
    @EJB
    private SeguridadFacade seguridadFacade;
    @EJB
    private CorreoFacade correoFacade;
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
            out.println("<title>Servlet SerCrear</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SerCrear at " + request.getContextPath() + "</h1>");
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
         disparcher = getServletContext().getRequestDispatcher("/Login.jsp");
        
        
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        String tdoc = request.getParameter("tdoc");
        String ndoc = request.getParameter("ndoc");
        int doc = Integer.parseInt(ndoc);
        String usuario = request.getParameter("usuario");
        String pass = request.getParameter("cont");
        String correo = request.getParameter("correo");

        /**
         * Handles the HTTP <code>POST</code> method.
         *
         * @param nombre Parametro nombre del jsp
         * @param apellido parametro apellido del jsp
         * @param telefono parametro telefono del jsp
         * @param tdoc parametro tipo documento del jsp
         * @param ndoc parametro numero de documento del jsp 
         * @param usuario parametro usuario del jsp
         * @param pass parametro contraseña del jsp
         * @param correo parametro correo usuario del jsp 
         *
         *
         *
         */
        
        /** se crea una instancia de cada objeto entidad y de los sesion beans */
        Correo co = new Correo();
        co.setIdCorreo(correo);

        correoFacade.create(co);

        Seguridad sg = new Seguridad();
        sg.setUsuario(usuario);
        sg.setPassword(pass);

        seguridadFacade.create(sg);

        Usuario us = new Usuario();
        us.setIdUsuario(doc);
        us.setNombre(nombre);
        us.setApellido(apellido);
        us.setTelefono(telefono);
        us.setTipoDoc(tdoc);
        us.setCorreoIdCorreo(co);
        us.setSeguridadUsuario(sg);

        usuarioFacade.create(us);
        
         disparcher.forward(request, response);

        try (PrintWriter out = response.getWriter()) {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SerCrear</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SerCrear at " + nombre + apellido + telefono + tdoc + doc + usuario + pass + correo + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }

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
