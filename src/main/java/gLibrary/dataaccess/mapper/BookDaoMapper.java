package gLibrary.dataaccess.mapper;

import java.util.Date;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import gLibrary.domain.books.Book;
import gLibrary.domain.books.Isbn;
import gLibrary.domain.books.publishers.Publisher;
import gLibrary.domain.books.publishers.PublisherName;
import gLibrary.domain.books.techniquelevels.TechniqueRank;
import gLibrary.domain.users.departments.DepartmentCode;

@Mapper
public interface BookDaoMapper {
	public void insertPublisherInformation(PublisherName publisherName);
	public void registeredByBookAndPublisher(@Param("book")Book book,@Param("publicationDate")Date date, @Param("publisher")Publisher publisher);
	public Isbn findBookByIsbn(Isbn isbn);
	public void registerDescription(Book book);
	public void registerBookImage(Book book);
	public void registerRecommendedDepartment(@Param("isbn")Isbn isbn, @Param("departmentCode")DepartmentCode departmentCode);
	public void registerBookLevel(@Param("isbn")Isbn isbn, @Param("techniqueRank")TechniqueRank techniqueRank);
}
