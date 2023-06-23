package com.saurabh.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookInput {
    private  String title;
    private  String description;
    private  String author;
    private  float price;
    private  int pages;
}
