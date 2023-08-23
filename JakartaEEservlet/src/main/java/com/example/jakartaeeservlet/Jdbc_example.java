package com.example.jakartaeeservlet;

import org.postgresql.Driver;

import java.sql.*;

public class Jdbc_example {
    public static void main(String[] args) throws SQLException {
        BookService bookService=new BookService();

// Book book= Book.builder().title("Phyton lessson book ").page(12000).id(4)
//         .build();
//        bookService.update(book);
       // bookService.bookList().forEach(System.out::println);
        System.out.println("bookService.bookById(2) = " + bookService.bookById(2));

    }
}
