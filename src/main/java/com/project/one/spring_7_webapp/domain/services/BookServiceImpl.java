package com.project.one.spring_7_webapp.domain.services;

import com.project.one.spring_7_webapp.domain.Book;
import com.project.one.spring_7_webapp.domain.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }


}
