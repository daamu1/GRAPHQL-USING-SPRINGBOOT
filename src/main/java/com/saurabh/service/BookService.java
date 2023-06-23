package com.saurabh.service;

import com.saurabh.model.Book;

import java.util.List;

public interface BookService {
  Book create(Book book);
  List<Book>getAll();
  Book getOne(int bookId);
}
