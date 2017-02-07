/**
 * Created by Lizzi on 31.01.2017.
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 */
public class HelloWorld extends HttpServlet {


    private String message;


    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, "+ request.getParameter("username") +"</h1>");
    }


}
