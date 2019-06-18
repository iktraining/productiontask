package gLibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gLibrary.dataaccess.mapper.SearchDaoMapper;
import gLibrary.domain.books.BookList;

@Service("SearchServiceImpl")
public class SearchServiceImpl implements SearchService{
	@Autowired
	SearchDaoMapper searchDaoMapper;

	public BookList keywordSearch(String keyword) {
		return new BookList(searchDaoMapper.keywordSearch(keyword));
	}
}
