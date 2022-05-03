/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Programs;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 *
 * @author hp
 */
@WebServlet(name = "servlet2", urlPatterns = {"/servlet2"})
public class servlet2 extends HttpServlet {
    private String cel;

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         String enteredcity = request.getParameter("city");
         
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
           
           
            out.println("<title>Servlet servlet2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<script>");
            out.println("HashMap<String, Integer> map = new HashMap<>();");
            out.println("map.put(\"Chennai\", 43 );");
            out.println("map.put(\"Madurai\", 39 );");
            out.println("map.put(\"Coimbatore\", 35 );");
            out.println("map.put(\"Vellore\", 44 );");
           
                    out.println("if (map.containsKey(enteredcity)");
                         out.println("Integer a = map.get(enteredcity);");
                         
                         out.println("</script>");
                         out.println("<p>The Weather report of"+enteredcity+"city is"+a+"Degree Celcius</p>");
           
         
           
                                   
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
