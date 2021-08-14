package com.sushet.springwebapp.BootStrap;

import com.sushet.springwebapp.domain.Author;
import com.sushet.springwebapp.domain.Book;
import com.sushet.springwebapp.domain.Publisher;
import com.sushet.springwebapp.domain.repository.AuthorRepository;
import com.sushet.springwebapp.domain.repository.BookRepository;
import com.sushet.springwebapp.domain.repository.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements ApplicationListener<ContextRefreshedEvent> {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        Author eric = new Author("Eric","Evans");
        Publisher pub= new Publisher("xyz","Bangalore","bgl","Karnataka");
        Book ddd= new Book("Domain Driven Design","123455",pub);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        publisherRepository.save(pub);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod =new Author("Rod","Johnson");
        Book noEJB=new Book("J2ee Development without EJB","1234566",pub);
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        authorRepository.save(rod);
        bookRepository.save(noEJB);
        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books"+ bookRepository.count());

       // pub.getBooks().add(noEJB);
        //pub.getBooks().add(ddd);

        System.out.println("Publishers"+publisherRepository.count());







    }
}
