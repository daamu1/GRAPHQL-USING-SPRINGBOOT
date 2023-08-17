package com.saurabh.controller;

import com.saurabh.model.Book;
import com.saurabh.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookController {
    private final BookService bookService;

    @MutationMapping("createBook")
    public Book createBook(@Argument BookInput bookInput) {
        Book book = Book.builder()
                .pages(bookInput.getPages())
                .title(bookInput.getTitle())
                .description(bookInput.getDescription())
                .author(bookInput.getAuthor())
                .price(bookInput.getPrice())
                .build();
        return bookService.addNewBookDetails(book);
    }


    @QueryMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBookDetails();
    }

    @QueryMapping
    public Book getBookById(@Argument("bookId") int bookId) {
        return bookService.getBookDetailsByBookId(bookId);
    }
}
