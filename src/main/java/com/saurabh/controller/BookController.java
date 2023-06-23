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
        Book book=new Book();
        book.setPages(bookInput.getPages());
        book.setTitle(bookInput.getTitle());
        book.setDescription(bookInput.getDescription());
        book.setAuthor(bookInput.getAuthor());
        book.setPrice(bookInput.getPrice());
        return bookService.create(book);
    }

    @QueryMapping
    public List<Book> getAllBooks() {
        return bookService.getAll();
    }

    @QueryMapping
    public Book getBookById(@Argument("bookId") int bookId) {
        return bookService.getOne(bookId);
    }
}
