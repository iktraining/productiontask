package gLibrary.service;

import org.springframework.stereotype.Service;

import gLibrary.domain.books.BookList;
import gLibrary.domain.books.criteria.BookSearchCriteria;
import gLibrary.domain.books.criteria.PublicationDateRangeCriteria;

@Service
public interface SearchService {

	public BookList keywordSearch(String word);
	public BookList isbnSearch(String word);
	public BookList pubDateSearch(PublicationDateRangeCriteria pubDateRangeCriteria);

	public BookList search(BookSearchCriteria bookSearchCriteria);
}
