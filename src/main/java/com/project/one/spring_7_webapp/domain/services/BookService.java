package com.project.one.spring_7_webapp.domain.services;

import com.project.one.spring_7_webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}