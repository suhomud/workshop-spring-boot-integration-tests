package io.brahman.store.repository;

import io.brahman.store.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

	private List<Book> books = new ArrayList<>();

	public List<Book> getAll() {
		return new ArrayList<>(books);
	}

	public void clear() {
		books.clear();
	}

	public void add(Book recipient) {
		books.add(recipient);
	}
}
