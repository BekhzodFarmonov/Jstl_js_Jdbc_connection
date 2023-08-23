package com.example.jakartaeeservlet;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Book {
    private  Integer id;
    private  String title;
    private int page;
}
