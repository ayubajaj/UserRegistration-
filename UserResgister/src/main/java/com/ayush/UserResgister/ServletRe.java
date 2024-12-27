package com.ayush.UserResgister;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

@WebServlet("/hello")
public class ServletRe extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("Servelet");
        res.setContentType("text/html");
        res.getWriter().println("<h2><b>Hello World</b></h2>");







    }
}
