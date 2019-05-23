package name.browniz23.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import name.browniz23.provider.Book;
import name.browniz23.service.BookService;

@RestController
@RequestMapping(value = "/books")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("{bookId}")
	public ResponseEntity<Book> findById(Long bookId) {
		Book book = bookService.findById(bookId)
				.orElseThrow(()-> new RuntimeException("Not found: " + bookId));
		return ResponseEntity.ok(book);
	}
}
