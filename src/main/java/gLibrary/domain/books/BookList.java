package gLibrary.domain.books;

import java.util.List;

public class BookList {
	private List<Book> bookList;

	public BookList() {}

	public BookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return String.format("BookList [bookList=%s]", bookList);
	}

}
