import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

@WebServlet("/login")
public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        
        if(Validate.checkUser(email, pass))
        {
            HttpSession session=request.getSession();  

            session.setAttribute("uname",email);  
            session.setAttribute("role","Admin");  

            // RequestDispatcher rs = request.getRequestDispatcher("Welcome");
            request.setAttribute("uname", (String)session.getAttribute("uname"));
            request.setAttribute("role", (String)session.getAttribute("role"));

            RequestDispatcher rs = request.getRequestDispatcher("welcome.jsp");
            rs.forward(request, response);
        }
        else
        {
           out.println("Username or Password incorrect");
           RequestDispatcher rs = request.getRequestDispatcher("index.html");
           rs.include(request, response);
        }
    }
}