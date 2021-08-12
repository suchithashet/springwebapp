package com.sushet.springwebapp.domain.repository;

import com.sushet.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository  extends CrudRepository<Book, Long> {


}
