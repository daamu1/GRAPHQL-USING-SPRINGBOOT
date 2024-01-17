package com.saurabh.service.implementation;

import com.saurabh.model.Book;
import com.saurabh.repo.BookRepository;
import com.saurabh.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public Book addNewBookDetails(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBookDetails() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookDetailsByBookId(int bookId) {
        Optional<Book> bookOptional = bookRepository.findById(bookId);
        return bookOptional.orElseThrow(() -> new RuntimeException("Book not found with ID: " + bookId));
    }
}

