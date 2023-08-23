package com.example.jakartaeeservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
 @WebServlet(name ="com/example/jakartaeeservlet/CalculatorServlet",value = "/calc")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("index.html");
    }
     @Override
     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         int a = Integer.parseInt(req.getParameter("a"));
         int b = Integer.parseInt(req.getParameter("b"));
         String o = req.getParameter("o");
         String result = a + " " + o + " " + b + "=";

         if (o.equals("+")) {
             result = result + (a + b);
         } else if (o.equals("-")) {
             result = result + Math.abs(a - b);
         } else if (o.equals("/")) {
             result = result + (a / b);
         } else {
             result = result + (a * b);
         }
         PrintWriter writer = resp.getWriter();
         writer.println("<h1>" + result + "</h1>");
     }
 }


