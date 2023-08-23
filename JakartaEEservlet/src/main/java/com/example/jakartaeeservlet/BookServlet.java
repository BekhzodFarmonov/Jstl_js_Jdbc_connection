package com.example.jakartaeeservlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "BookServlet", value = "/book/add")
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // bu oddiy hol servletddan servlaetga utishda
//        PrintWriter writer = resp.getWriter();
//        writer.println("<h1>Book Create Page</h1>");
//        writer.println("<form method=\"post\">\n" +
//                "    <input type=\"submit\" value=\"add\">\n" +
//                "</form>");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/book.jsp");
        requestDispatcher.
                forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        System.out.println("save database ");
        resp.sendRedirect("/JakartaEEservlet_war_exploded/Book/List");
    }
}