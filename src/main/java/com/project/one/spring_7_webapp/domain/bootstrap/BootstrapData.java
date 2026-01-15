package com.project.one.spring_7_webapp.domain.bootstrap;

import com.project.one.spring_7_webapp.domain.Author;
import com.project.one.spring_7_webapp.domain.Book;
import com.project.one.spring_7_webapp.domain.Publisher;
import com.project.one.spring_7_webapp.domain.repositories.AuthorRepository;
import com.project.one.spring_7_webapp.domain.repositories.BookRepository;
import com.project.one.spring_7_webapp.domain.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author1 = new Author();
        author1.setFirstName("Corey");
        author1.setLastName("Rose");

        Author author2 = new Author();
        author2.setFirstName("Napoleon");
        author2.setLastName("Hill");

        Book book1 = new Book();
        book1.setTitle("Corey Rose: The Autobiography");
        book1.setIsbn("777");

        Book book2 = new Book();
        book2.setTitle("Think and Grow Rich");
        book2.setIsbn("246");

        Publisher publisher1 = new Publisher();
        publisher1.setPublisherName("Corey Rose Publishing");
        publisher1.setAddress("Bellair Ave");
        publisher1.setCity("Fair Lawn");
        publisher1.setState("NJ");
        publisher1.setZipCode("07410");

        Author author1Saved = authorRepository.save(author1);
        Author author2Saved = authorRepository.save(author2);

        publisher1.getBooks().add(book1);
        publisher1.getBooks().add(book2);
        publisherRepository.save(publisher1);

        author1Saved.getBooks().add(book1);
        author2Saved.getBooks().add(book2);
        book1.getAuthors().add(author1Saved);
        book2.getAuthors().add(author2Saved);

        bookRepository.save(book1);
        bookRepository.save(book2);
        authorRepository.save(author1Saved);
        authorRepository.save(author2Saved);

        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());
        System.out.println("Publisher Count: " + publisherRepository.count());
    }
}
