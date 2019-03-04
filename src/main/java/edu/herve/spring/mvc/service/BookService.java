package edu.herve.spring.mvc.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import edu.herve.spring.mvc.domain.Book;

//import edu.herve.spring.mvc.domain.Book;


public interface BookService {
	List<Book> findAll();
	Book save(Book book);
	Book findById(Long id);
	Page<Book> findAllByPage(Pageable pageable);
	Book remove(Long id);
	
}
