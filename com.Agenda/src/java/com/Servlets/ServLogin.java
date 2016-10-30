/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Servlets;

import com.Entidades.Agenda;
import com.Entidades.Seguridad;
import com.Entidades.Usuario;
import com.Session.SeguridadFacade;
import com.Session.UsuarioFacade;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.Collection;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * declaracion de la Servlet  ServLogin
 *
 *
 * @author Damage Control
 * @version 0.1.6
 */
public class ServLogin extends HttpServlet {
    @EJB
    private UsuarioFacade usuarioFacade;
    @EJB
    private SeguridadFacade seguridadFacade;

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
            out.println("<title>Servlet ServLogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServLogin at " + request.getContextPath() + "</h1>");
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
       //RequestDispatcher disparcher = null;
        
        String nom =null,id ;
        
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        
        Seguridad seg = seguridadFacade.find(user);
        Usuario uss = new Usuario();
        
        
        Collection<Usuario> ust = usuarioFacade.findAll();
        Usuario [] usert = new Usuario[ust.size()];
        
        for (int i=0; i<=1;i++){
            
            nom =usert[i].getNombre();
            out.println(" <h1 Se ha generado un error Por favor vuelva a intentarlo  </h>"+ nom);
        }
      
       
        
        
        /*
        String pass1 = seg.getPassword();
        String usss= seg.getUsuario();
        if (pass1.equals(pass)){
            
           
            //disparcher = getServletContext().getRequestDispatcher("/index.jsp");
            
             //request.setAttribute("nombre", size);
             
        }
        
         //disparcher.forward(request, response);*/
         
         
         
        
     
    }
    
    
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param user Parametro de usuario para verificacion 
     * @param pass Parametro de contraseña para verificacion
     * @param pass1 Parametro de usuario para verificacion desde la entidad
     * @param usss Parametro de contraseña para verificacion desde la entidad
     */

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
