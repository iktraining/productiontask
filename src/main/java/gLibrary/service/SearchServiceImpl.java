package gLibrary.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gLibrary.dataaccess.mapper.SearchDaoMapper;
import gLibrary.domain.books.BookList;
import gLibrary.domain.books.criteria.BookSearchCriteria;
import gLibrary.domain.books.criteria.PublicationDateRangeCriteria;

@Service("SearchServiceImpl")
public class SearchServiceImpl implements SearchService {
	@Autowired
	SearchDaoMapper searchDaoMapper;

	@Override
	public BookList keywordSearch(String word) {
		return new BookList(searchDaoMapper.keywordSearch(wordMapping(word, "keywords")));
	}

	@Override
	public BookList isbnSearch(String word) {
		return new BookList(searchDaoMapper.isbnSearch(wordMapping(word, "isbns")));
	}

	@Override
	public BookList pubDateSearch(PublicationDateRangeCriteria publicationDateRangeCriteria) {
		Date fromDate = publicationDateRangeCriteria.getPublicationFromDateCriteria().getDate();
		Date toDate = publicationDateRangeCriteria.getPublicationToDateCriteria().getDate();
		return new BookList(
				searchDaoMapper.pubDateSearch(
						publicationDateRangeCriteria.getPublicationFromDateCriteria(),
						publicationDateRangeCriteria.getPublicationToDateCriteria(),
						fromDate,
						toDate)
				);
	}

	@Override
	public BookList search(BookSearchCriteria bookSearchCriteria) {
		Map<String, Object> params = new HashMap<>();

		if(bookSearchCriteria.getKeywordCriteria().hasKeyword())
			wordMapping(bookSearchCriteria.getKeywordCriteria().getKeyword(), "keywords", params);
		if(bookSearchCriteria.getIsbn().hasIsbn())
			wordMapping(bookSearchCriteria.getIsbn().getIsbn(), "isbns", params);
		if(bookSearchCriteria.getTitleCriteria().hasTitle())
			wordMapping(bookSearchCriteria.getTitleCriteria().getTitle(), "titles", params);
		if(bookSearchCriteria.getAuthorCriteria().hasAuthor())
			wordMapping(bookSearchCriteria.getAuthorCriteria().getAuthor(), "authors", params);
		if(bookSearchCriteria.getPublisherNameCriteria().hasName())
			wordMapping(bookSearchCriteria.getPublisherNameCriteria().getName(), "publishers", params);

		Date fromDate = null;
		Date toDate= null;
		if(bookSearchCriteria.getPublicationDateRangeCriteria().getPublicationFromDateCriteria().isNotEmpty() ||
				bookSearchCriteria.getPublicationDateRangeCriteria().getPublicationToDateCriteria().isNotEmpty()) {
			fromDate = bookSearchCriteria.getPublicationDateRangeCriteria().getPublicationFromDateCriteria().getDate();
			toDate =bookSearchCriteria.getPublicationDateRangeCriteria().getPublicationToDateCriteria().getDate();
		}

		return new BookList(searchDaoMapper.search(
				params,
				bookSearchCriteria.getPublicationDateRangeCriteria().getPublicationFromDateCriteria(),
				bookSearchCriteria.getPublicationDateRangeCriteria().getPublicationToDateCriteria(),
				fromDate,
				toDate
				)
				);

	}

	private Map<String, Object> wordMapping(String word, String key, Map<String, Object> params) {
		String[] words = word.split("[　 ]");
		params.put(key, words);
		return params;
	}

	private Map<String, Object> wordMapping(String word, String key) {
		String[] words = word.split("[　 ]");
		Map<String, Object> params = new HashMap<>();
		params.put(key, words);
		return params;
	}
}