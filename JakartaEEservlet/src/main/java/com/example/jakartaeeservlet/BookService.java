package com.example.jakartaeeservlet;

import org.postgresql.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookService {
    public Integer save(Book book){
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/jakarta",
                    "postgres",
                    "behzod2428");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("INSERT INTO  book(title,page) " +
                    "values ('"+book.getTitle()+"','"+book.getPage()+"') returning id");
if(resultSet.next()){
    return resultSet.getInt("id");}
return -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void update(Book book){
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/jakarta",
                    "postgres",
                    "behzod2428");
            var statement = connection.prepareStatement("UPDATE book set title=?,page=? where id=?;");
            statement.setString(1, book.getTitle());
            statement.setInt(2, book.getPage());
            statement.setInt(3, book.getId());
            statement.execute();
         } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Book> bookList(){
        var books=new ArrayList<Book>();
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/jakarta",
                    "postgres",
                    "behzod2428");
            var statement = connection.prepareStatement("SELECT * from book;");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Book book = Book.builder().id(resultSet.getInt("id")).
                        title(resultSet.getString("title")).
                        page(resultSet.getInt("page")).build();
                books.add(book);
            }
            return books;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public Book bookById(int id){
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/jakarta",
                    "postgres",
                    "behzod2428");
            var statement = connection.prepareStatement(" SELECT * from book b where b.id=?;");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                return  Book.builder().id(resultSet.getInt("id")).
                        title(resultSet.getString("title")).
                        page(resultSet.getInt("page")).build();
        }
            return null;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
    }
}}
