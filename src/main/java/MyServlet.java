

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MyServlet extends HttpServlet {


String reverse(String s)
{ int length = s.length();
    char[] c=s.toCharArray();
    char[] reverse=new char[length];
for (int i=length;i>0;i--)
for (int j=1;j<length;j++){
    reverse[j]=c[i];
}
return reverse.toString();
}
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String username = (String) request.getParameter("username");
        username = username.toUpperCase();
        username=reverse(username);
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<!DOCTYPE HTML>");
        response.getWriter().println("<html><body><p>" +  username + "</p></body></html>");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}