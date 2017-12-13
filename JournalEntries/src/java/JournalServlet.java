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
public class JournalServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

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
                
        response.setContentType("text/html;charset=UTF-8");
            
            PrintWriter pw=response.getWriter();
            
            pw.print("<html>");
            pw.print("<head>");
                pw.print("<title>Journal Summary Powerpoint</title>");
            pw.print("</head>");
                pw.print("<body bgcolor=#424949>");
                            
                    pw.print("<br>");
                    pw.print("<iframe src=\"https://docs.google.com/presentation/d/e/2PACX-1vQ14kjmRdq9HtscPy5Rga6nKg0KTcmAtTT5j7fkY-k1w8ve2vjj8u0IOWYObXlFw877v720tfHB_zZC/embed?start=true&loop=true&delayms=30000\" frameborder=\"0\" width=\"960\" height=\"749\" allowfullscreen=\"true\" mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\"></iframe>");
                    pw.print("<br>");
                    
                    pw.print("<a href=\"index.html\"><font color =#FDFEFE>Back</font></a>");
                  
                pw.print("</body>");
            pw.print("</html>");        
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
