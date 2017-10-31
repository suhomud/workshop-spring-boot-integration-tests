package io.brahman.store.domain;

import java.util.ArrayList;
import java.util.List;

public class WebResponse<T> {

	private Store store;

	public WebResponse(List<T> goods) {
		this.store = new Store(goods);
	}

	public WebResponse(T good) {
		this.store = new Store(good);
	}

	public Object getStore() {
		return store;
	}

	private class Store {
		private List<T> books;

		private Store(List<T> books) {
			this.books = books;
		}

		private Store(T book) {
			this.books = new ArrayList<>();
			this.books.add(book);
		}

		public List<T> getBooks() {
			return books;
		}
	}

}
