package com.AngularBooks.Services;

import java.util.List;

import com.AngularBooks.Entity.Books;

public interface BookService {

	public Books getSingleBook(int bookId);
	public List<Books>getThemAll();
	public Books addSingleBook(Books book);
	public Books updateSingleBook(Books book);
	public void deleteBook(int bookId);
}
