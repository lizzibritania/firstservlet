

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        BufferedReader reader = request.getReader();
        String rev=reader.readLine();
        rev=reverse(rev);
        out.println("<h1> "+ rev +"</h1>");;
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}