import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

@WebServlet("/Welcome")
public class Welcome extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              HttpSession session=request.getSession();  
              String uname=(String)session.getAttribute("uname");
              String role=(String)session.getAttribute("role");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("Welcome user "+uname +" with "+role);
      }  
}
