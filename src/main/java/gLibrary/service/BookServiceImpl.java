package gLibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gLibrary.dataaccess.mapper.BookDaoMapper;
import gLibrary.domain.books.Book;
import gLibrary.domain.books.Isbn;
import gLibrary.domain.books.publishers.Publisher;
import gLibrary.domain.books.publishers.PublisherName;
import gLibrary.domain.books.techniquelevels.TechniqueLevel;
import gLibrary.domain.users.departments.Department;

@Service("BookServiceImpl")
public class BookServiceImpl implements BookService {
	@Autowired
	BookDaoMapper bookDaoMapper;

	public void insertPublisherInformation(PublisherName publisherName) {
		bookDaoMapper.insertPublisherInformation(publisherName);
	}

	public void register(Book book, Publisher publisher) {
		bookDaoMapper.registeredByBookAndPublisher(book, book.getPubDate().createDate(), publisher);
	}

	public boolean hasBook(Isbn isbn) {
		if(null == bookDaoMapper.findBookByIsbn(isbn)) {
			return false;
		}
		return true;
	}

	public void registerDescription(Book book) {
		bookDaoMapper.registerDescription(book);
	}

	public void registerBookImage(Book book) {
		bookDaoMapper.registerBookImage(book);
	}

	public void registerRecommendedDepartment(Book book) {
		for(Department department:book.getRecommendedDepartment().getDepartmentList().getDepartmentList()) {
			bookDaoMapper.registerRecommendedDepartment(book.getIsbn(), department.getDepartmentCode());
		}
	}

	public void registerBookLevel(Book book) {
		for(TechniqueLevel techniqueLevel:book.getTechniqueLevelList().getTechniqueLevelList()) {
			bookDaoMapper.registerBookLevel(book.getIsbn(), techniqueLevel.getTechniqueRank());
		}
	}
}
