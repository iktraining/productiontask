package gLibrary.domain.books.criteria;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import gLibrary.domain.books.Isbn;
import gLibrary.domain.books.techniquelevels.TechniqueLevelList;
import gLibrary.domain.users.departments.DepartmentList;

@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class BookSearchCriteria {
	private AuthorCriteria authorCriteria;
	private TitleCriteria titleCriteria;
	private PublisherNameCriteria publisherNameCriteria;
	private KeywordCriteria keywordCriteria;
	private PublicationDateRangeCriteria publicationDateRangeCriteria;

	private Isbn isbn;
	private TechniqueLevelList techniqueLevelList;
	private DepartmentList departmentList;

	public BookSearchCriteria() {}

	public BookSearchCriteria(AuthorCriteria authorCriteria, TitleCriteria titleCriteria,
			PublisherNameCriteria publisherNameCriteria, KeywordCriteria keywordCriteria,
			PublicationDateRangeCriteria publicationDateRangeCriteria, Isbn isbn, TechniqueLevelList techniqueLevelList,
			DepartmentList departmentList) {
		super();
		this.authorCriteria = authorCriteria;
		this.titleCriteria = titleCriteria;
		this.publisherNameCriteria = publisherNameCriteria;
		this.keywordCriteria = keywordCriteria;
		this.publicationDateRangeCriteria = publicationDateRangeCriteria;
		this.isbn = isbn;
		this.techniqueLevelList = techniqueLevelList;
		this.departmentList = departmentList;
	}

	public AuthorCriteria getAuthorCriteria() {
		return authorCriteria;
	}

	public TitleCriteria getTitleCriteria() {
		return titleCriteria;
	}

	public PublisherNameCriteria getPublisherNameCriteria() {
		return publisherNameCriteria;
	}

	public KeywordCriteria getKeywordCriteria() {
		return keywordCriteria;
	}


	public Isbn getIsbn() {
		return isbn;
	}

	public TechniqueLevelList getTechniqueLevelList() {
		return techniqueLevelList;
	}

	public DepartmentList getDepartmentList() {
		return departmentList;
	}

	public void setAuthorCriteria(AuthorCriteria authorCriteria) {
		this.authorCriteria = authorCriteria;
	}

	public void setTitleCriteria(TitleCriteria titleCriteria) {
		this.titleCriteria = titleCriteria;
	}

	public void setPublisherNameCriteria(PublisherNameCriteria publisherNameCriteria) {
		this.publisherNameCriteria = publisherNameCriteria;
	}

	public void setKeywordCriteria(KeywordCriteria keywordCriteria) {
		this.keywordCriteria = keywordCriteria;
	}

	public void setIsbn(Isbn isbn) {
		this.isbn = isbn;
	}

	public void setTechniqueLevelList(TechniqueLevelList techniqueLevelList) {
		this.techniqueLevelList = techniqueLevelList;
	}

	public void setDepartmentList(DepartmentList departmentList) {
		this.departmentList = departmentList;
	}

	public PublicationDateRangeCriteria getPublicationDateRangeCriteria() {
		return publicationDateRangeCriteria;
	}

	public void setPublicationDateRangeCriteria(PublicationDateRangeCriteria publicationDateRangeCriteria) {
		this.publicationDateRangeCriteria = publicationDateRangeCriteria;
	}
}
