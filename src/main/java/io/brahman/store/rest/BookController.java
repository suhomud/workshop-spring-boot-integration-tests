package io.brahman.store.rest;

import io.brahman.store.domain.Book;
import io.brahman.store.domain.WebResponse;
import io.brahman.store.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

	private final BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping(
			method = RequestMethod.GET,
			produces = {"application/json"})
	@ResponseStatus(HttpStatus.OK)
	public WebResponse getAll() {
		return new WebResponse<>(bookService.getAll());
	}

	@RequestMapping(
			method = RequestMethod.POST,
			produces = {"application/json"})
	@ResponseStatus(HttpStatus.CREATED)
	public void add(@RequestBody Book book) {
		bookService.add(book);
	}

	@RequestMapping(
			method = RequestMethod.DELETE,
			produces = {"application/json"})
	@ResponseStatus(HttpStatus.CREATED)
	public void clear() {
		bookService.clear();
	}

}
