package io.brahman.store.domain;

import java.util.List;

public class WebResponse<T> {

	private Store store;

	public WebResponse(List<T> goods) {
		this.store = new Store(goods);
	}

	public Object getStore() {
		return store;
	}

	private class Store {
		private List<T> books;
		private Store(List<T> books) {
			this.books = books;
		}
		public List<T> getBooks() {
			return books;
		}
	}

}
