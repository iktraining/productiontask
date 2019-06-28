package gLibrary.dataaccess.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import gLibrary.domain.books.Book;
import gLibrary.domain.books.criteria.PublicationFromDateCriteria;
import gLibrary.domain.books.criteria.PublicationToDateCriteria;
import gLibrary.domain.books.techniquelevels.TechniqueLevelList;
import gLibrary.domain.users.departments.DepartmentList;

@Mapper
public interface SearchDaoMapper {
	public List<Book> keywordSearch(Map<String, Object> keywords);

	public List<Book> isbnSearch(Map<String, Object> isbns);

	public List<Book> titleSearch(Map<String, Object> titles);

	public List<Book> pubDateSearch(
			@Param("fromCriteria") PublicationFromDateCriteria publicationFromDateCriteria,
			@Param("toCriteria") PublicationToDateCriteria publicationToDateCriteria,
			@Param("fromDate")Date fromDate,
			@Param("toDate")Date toDate
			);

	public DepartmentList departmentSearch();

	public TechniqueLevelList techniqueLevelSearch();

	public List<Book> search(
			@Param("map") Map<String, Object> words,
			@Param("fromCriteria") PublicationFromDateCriteria publicationFromDateCriteria,
			@Param("toCriteria") PublicationToDateCriteria publicationToDateCriteria,
			@Param("fromDate")Date fromDate,
			@Param("toDate")Date toDate
			);
}
