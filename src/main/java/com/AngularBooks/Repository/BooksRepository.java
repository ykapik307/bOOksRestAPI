package com.AngularBooks.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AngularBooks.Entity.Books;



public interface BooksRepository  extends JpaRepository<Books, Integer> {

}
