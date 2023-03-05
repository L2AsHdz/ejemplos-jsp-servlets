package com.ipc2.holamundoservlet.web;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/hello-servlet")
public class HelloServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        var out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hola Mundo Servlet</h1>");
        out.println("</body></html>");
    }
}