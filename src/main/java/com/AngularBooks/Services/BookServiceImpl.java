package com.AngularBooks.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AngularBooks.Entity.Books;
import com.AngularBooks.Repository.BooksRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	public BooksRepository br;
	@Override
	public Books getSingleBook(int bookId) {
		
		return br.findById(bookId).get();
	}

	@Override
	public List<Books> getThemAll() {
		// TODO Auto-generated method stub
		return br.findAll();
	}

	@Override
	public Books addSingleBook(Books book) {
		// TODO Auto-generated method stub
		br.save(book);
		return book ;
	}

	@Override
	public Books updateSingleBook(Books book) {
		// TODO Auto-generated method stub
		br.save(book);
		return book ;
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		Books entity=br.getOne(bookId);
		br.delete(entity);
		
	}

}
