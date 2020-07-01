package com.artarkatesoft.buildingspringbootwebappsection2.bootstrap;

import com.artarkatesoft.buildingspringbootwebappsection2.domain.Author;
import com.artarkatesoft.buildingspringbootwebappsection2.domain.Book;
import com.artarkatesoft.buildingspringbootwebappsection2.repositories.AuthorRepository;
import com.artarkatesoft.buildingspringbootwebappsection2.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BootstrapData implements CommandLineRunner {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "456");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of books:" + bookRepository.count());

    }
}
