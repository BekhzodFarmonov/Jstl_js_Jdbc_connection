package com.example.jakartaeeservlet;

import java.time.LocalDate;

public class CurrentDate {
    public String now( String name){
        return "Hello"+" "+name+""+ LocalDate.of(2024,1,1).toString();
    }

}
