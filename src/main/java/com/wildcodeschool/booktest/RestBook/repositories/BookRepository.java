package com.wildcodeschool.booktest.RestBook.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.booktest.RestBook.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>  {

	 // custom query to search to book post by title or content
    List<Book> findByTitleContainingOrAuthorContainingOrDescriptionContaining(String text, String textAgain, 
    		String textContinue);
    
}