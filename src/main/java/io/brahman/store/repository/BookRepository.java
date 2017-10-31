package io.brahman.store.repository;

import io.brahman.store.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BookRepository {

	private Map<Integer, Book> books = new HashMap<>();

	public List<Book> getAll() {
		return new ArrayList<>(books.values());
	}

	public void clear() {
		books.clear();
	}

	public void add(Book book) {
		book.id = books.size();
		books.put(book.id, book);
	}

	public Book get(String bookId) {
		return books.get(Integer.valueOf(bookId));
	}
}
