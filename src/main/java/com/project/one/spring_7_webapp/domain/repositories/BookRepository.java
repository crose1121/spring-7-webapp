package com.project.one.spring_7_webapp.domain.repositories;

import com.project.one.spring_7_webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
