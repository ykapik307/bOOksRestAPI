package com.AngularBooks.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AngularBooks.Entity.Books;
import com.AngularBooks.Services.BookService;






@RestController
public class MyController {
	@Autowired
	public BookService use;
	@CrossOrigin(origins = "https://angular-books-kp.herokuapp.com")
	@GetMapping("/books/{bookId}")
	public Books getOneBook(@PathVariable int bookId)
	{
		return this.use.getSingleBook(bookId);
	}
	@CrossOrigin(origins = "https://angular-books-kp.herokuapp.com")
	@GetMapping("/books")
	public List<Books> getAllBooks()
	{
		return this.use.getThemAll();
	}
	@CrossOrigin(origins = "https://angular-books-kp.herokuapp.com")
	@PostMapping("/books")
	public Books addBook(@RequestBody Books book)
	{
		return this.use.addSingleBook(book);
	}
	@CrossOrigin(origins = "https://angular-books-kp.herokuapp.com")
	@PutMapping("/books")
	public Books updateBook(@RequestBody Books book )
	{
		return this.use.updateSingleBook(book);
	}
	@CrossOrigin(origins = "https://angular-books-kp.herokuapp.com")
	@DeleteMapping("/books/{bookId}")
	public ResponseEntity<HttpStatus> deleteBook(@PathVariable int bookId)
	{
		try {
			this.use.deleteBook(bookId);
	return new ResponseEntity<>(HttpStatus.OK);
	}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
}
}
