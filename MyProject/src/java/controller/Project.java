package controller;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class Project extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>welcome to the new world</h1>");
            out.println("</body>");
            out.println("</html>");
            
        }
    }
}
