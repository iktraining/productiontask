package gLibrary.dataaccess.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import gLibrary.domain.books.Book;
import gLibrary.domain.books.Isbn;
import gLibrary.domain.books.criteria.AuthorCriteria;
import gLibrary.domain.books.criteria.PubDateRangeCriteria;
import gLibrary.domain.books.criteria.PublisherNameCriteria;
import gLibrary.domain.books.criteria.TitleCriteria;
import gLibrary.domain.books.techniquelevels.TechniqueLevelList;
import gLibrary.domain.users.departments.DepartmentList;

@Mapper
public interface SearchDaoMapper {
	public List<Book> keywordSearch(String keyword);
	public Isbn isbnSearch();
	public TitleCriteria titleSearch();
	public AuthorCriteria authorSearch();
	public PublisherNameCriteria publisherSearch();
	public PubDateRangeCriteria pubDateSearch();
	public DepartmentList departmentSearch();
	public TechniqueLevelList techniqueLevelSearch();
}
