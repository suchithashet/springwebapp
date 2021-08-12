package com.sushet.springwebapp.domain;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books =new HashSet<>();

    public Author ()
    {}

    public Author( String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
