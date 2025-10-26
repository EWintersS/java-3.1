import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        if (user.equals("admin") && pass.equals("12345")) {
            out.println("<html><body>");
            out.println("<h2>Welcome, " + user + "!</h2>");
            out.println("</body></html>");
        } else {
            out.println("<html><body>");
            out.println("<h3>Invalid credentials. Try again.</h3>");
            out.println("</body></html>");
        }
    }
}

