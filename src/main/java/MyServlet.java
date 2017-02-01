

import java.io.IOException;
import java.io.PrintWriter;
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
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String rev=request.getParameter("str");
        rev=reverse(rev);

        out.println("<h1>Hello, "+ rev +"</h1>");;
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}