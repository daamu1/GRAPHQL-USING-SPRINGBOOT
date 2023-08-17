package com.saurabh.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BookInput {
    private  String title;
    private  String description;
    private  String author;
    private  float price;
    private  int pages;
}
