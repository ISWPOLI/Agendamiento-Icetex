/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Entidades.Usuario;
import Sesiones.UsuarioFacade;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Willy
 */
public class ServlCrear extends HttpServlet {
    @EJB
    private UsuarioFacade usuarioFacade;

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
            out.println("<title>Servlet ServlCrear</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServlCrear at " + request.getContextPath() + "</h1>");
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
         disparcher = getServletContext().getRequestDispatcher("/Registro.jsp");
         
         String mess = "registro exitoso";
        String nombre =request.getParameter("nombre");
        String apellido =request.getParameter("apellido");
        String  ndoc = request.getParameter("documento");
        long doc = Integer.parseInt(ndoc);
        String direccion = request.getParameter("direccion");
        String tele = request.getParameter("telefono");
        String sex = request.getParameter("tsex");
        String usuario = request.getParameter("usuario");
        String pass = request.getParameter("pass");
        
        Usuario us = new Usuario();
        us.setNombre(nombre);
        us.setApellido(apellido);
        us.setUsDocumento(doc);
        us.setUsDireccion(direccion);
        us.setUsTelefono(tele);
        us.setSexo(sex);
        us.setUsuario(usuario);
        us.setContraseña(pass);
        
        usuarioFacade.create(us);
        
         request.setAttribute("mensaje",mess);
        
         disparcher.forward(request, response);
        
         try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServlCrear</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServlCrear at " + request.getContextPath() + "</h1>");
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
