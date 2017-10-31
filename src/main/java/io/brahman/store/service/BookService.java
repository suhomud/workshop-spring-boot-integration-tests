package io.brahman.store.service;

import io.brahman.store.domain.Book;
import io.brahman.store.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;


@Service
public class BookService {

	private final BookRepository bookRepository;

	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public List<Book> getAll() {
		return bookRepository.getAll();
	}


	public void clear() {
		bookRepository.clear();
	}

	public void add(Book recipient) {
		bookRepository.add(recipient);
	}


	public Book get(String bookId) {
		return bookRepository.get(bookId);
	}

	public List<Book> getByTitle(String bookTitle) {
		List<Book> all = bookRepository.getAll();
		return all.stream()
				.filter(book -> bookTitle.equals(book.title))
				.collect(toList());
	}

}
