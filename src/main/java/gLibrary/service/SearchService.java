package gLibrary.service;

import org.springframework.stereotype.Service;

import gLibrary.domain.books.BookList;

@Service
public interface SearchService {
	public BookList keywordSearch(String keyword);
}
