package gLibrary.service;

import org.springframework.stereotype.Service;

import gLibrary.domain.books.Book;
import gLibrary.domain.books.Isbn;
import gLibrary.domain.books.publishers.Publisher;
import gLibrary.domain.books.publishers.PublisherName;

@Service
public interface BookService {
	public void insertPublisherInformation(PublisherName publisherName);
	public void register(Book book, Publisher publisher);
	public boolean hasBook(Isbn isbn);
	public void registerDescription(Book book);
	public void registerBookImage(Book book);
	public void registerRecommendedDepartment(Book book);
	public void registerBookLevel(Book book);
}