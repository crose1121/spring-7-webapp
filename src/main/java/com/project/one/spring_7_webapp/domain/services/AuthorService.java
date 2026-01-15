package com.project.one.spring_7_webapp.domain.services;

import com.project.one.spring_7_webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
