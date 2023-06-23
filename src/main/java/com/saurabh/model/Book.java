package com.saurabh.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String title;
    private  String description;
    private  String author;
    private  float price;
    private  int pages;
}
