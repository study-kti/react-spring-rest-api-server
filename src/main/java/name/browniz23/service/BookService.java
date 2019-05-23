package name.browniz23.service;

import java.util.Optional;

import name.browniz23.domain.Book;

public interface BookService {

	Optional<Book> findById(Long id);
	
}
