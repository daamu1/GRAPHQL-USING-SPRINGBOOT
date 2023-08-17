package com.saurabh.service;

import com.saurabh.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BookService {
  Book addNewBookDetails(Book book);
  List<Book> getAllBookDetails();
  Book getBookDetailsByBookId(int bookId);
}
