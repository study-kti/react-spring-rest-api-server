package name.browniz23.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import name.browniz23.domain.Book;
import name.browniz23.domain.BookRepository;

@Service
@Transactional
public class BookServiceImpl implements BookService{
	private final BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public Optional<Book> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
