package com.saurabh.service.implementation;

import com.saurabh.model.Book;
import com.saurabh.repo.BookRepo;
import com.saurabh.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookServiceimpl implements BookService {
    private  final BookRepo bookRepo;
    @Override
    public Book create(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepo.findAll();
    }

    @Override
    public Book getOne(int bookId) {
        Optional<Book> bookOptional = this.bookRepo.findById(bookId);
        if (bookOptional.isEmpty()) {
            throw new RuntimeException("This book is not available at the store!!");
        }
        return bookOptional.get();
    }

}
