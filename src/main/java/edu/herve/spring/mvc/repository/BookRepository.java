package edu.herve.spring.mvc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import edu.herve.spring.mvc.domain.Book;

//import edu.herve.spring.mvc.domain.Book;

public interface BookRepository extends PagingAndSortingRepository<Book, Long>{

}
