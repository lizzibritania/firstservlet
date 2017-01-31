

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MyServlet extends HttpServlet {


    static String reverse(String s) {
        int length = s.length();
        char[] c = s.toCharArray();
        String res="";
        for (int i = length-1; i  > -1; i--) {
            res=res+c[i];
        }
        return res;    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String username = (String) request.getParameter("username");

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<!DOCTYPE HTML>");
        response.getWriter().println("<html><body><p>" +  username+"fuck" + "</p></body></html>");
        response.getWriter().println(reverse("тут типа реверс"));
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}