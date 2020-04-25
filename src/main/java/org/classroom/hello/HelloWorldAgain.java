package org.classroom.hello;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/helloworldagain")
public class HelloWorldAgain extends HttpServlet {

    private String message;

    public void init() throws ServletException {
        message = "Hello World Again!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
        out.println("<p>" + new Date().toString() + "</p>");
    }
}
