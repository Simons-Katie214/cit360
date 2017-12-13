/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author klsim
 */
public class GreetingsServlet extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        String firstName = request.getParameter("firstName").toString();
        String lastName = request.getParameter("lastname").toString();
        
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GreetingsServlet</title>");            
            out.println("</head>");
            out.println("<body bgcolor=\"#34495E\">");
            out.println("<h1><font color=\"#F4D03F\">Greetings From my Servlet at " + request.getContextPath() + "</font></h1>");
            out.println("<p><font color=#ECF0F1 size=5>Welcome " + firstName + " " + lastName + "</font></p>");
            out.println("<p><font color=#ECF0F1 size=5>Thanks for visiting.</font></p>");
            out.println("<p><font color=#ECF0F1 size=5>In case you were wondering Peter Pan is one of my "
                    + "favorite stories, so here's my favorite quote from it:</font></p>");
            out.println("<p><font color=#F4D03F size=5>To live would be an awfully BIG adventure</font></p>");
            out.println("<p><font color=#ECF0F1 size=5>Have a good day!</font></p>");
            out.println("</body>");
            out.println("</html>");
        
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
       String firstName = request.getParameter("firstName").toString();
       System.out.println("firstName = " + firstName);
       processRequest(request, response);
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
