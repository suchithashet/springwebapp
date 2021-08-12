package com.sushet.springwebapp.BootStrap;

import com.sushet.springwebapp.domain.Author;
import com.sushet.springwebapp.domain.Book;
import com.sushet.springwebapp.domain.Publisher;
import com.sushet.springwebapp.domain.repository.AuthorRepository;
import com.sushet.springwebapp.domain.repository.BookRepository;
import com.sushet.springwebapp.domain.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric","Evans");
        Book ddd= new Book("Domain Driven Design","123455");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod =new Author("Rod","Johnson");
        Book noEJB=new Book("J2ee Development without EJB","1234566");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        authorRepository.save(rod);
        bookRepository.save(noEJB);
        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books"+ bookRepository.count());
        Publisher pub= new Publisher("xyz","Bangalore","bgl","Karnataka");
        pub.getBooks().add(noEJB);
        pub.getBooks().add(ddd);
        publisherRepository.save(pub);
        System.out.println("Publishers"+publisherRepository.count());







    }
}
