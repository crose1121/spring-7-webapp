package com.project.one.spring_7_webapp.domain.repositories;

import com.project.one.spring_7_webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
