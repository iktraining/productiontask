package gLibrary.domain.books.criteria;

import gLibrary.domain.books.Isbn;
import gLibrary.domain.books.TechniqueLevels.TechniqueLevelList;
import gLibrary.domain.users.departments.DepartmentList;

public class BookSearchCriteria {
	private AuthorCriteria authorCriteria;
	private TitleCriteria titleCriteria;
	private PublisherNameCriteria publisherNameCriteria;
	private KeywordCriteria keywordCritera;
	private PubDateRangeCriteria pubDateRangeCriteria;

	private Isbn isbn;
	private TechniqueLevelList techniqueLevelList;
	private DepartmentList departmentList;

	public BookSearchCriteria(AuthorCriteria authorCriteria, TitleCriteria titleCriteria,
			PublisherNameCriteria publisherNameCriteria, KeywordCriteria keywordCritera,
			PubDateRangeCriteria pubDateRangeCriteria, Isbn isbn, TechniqueLevelList techniqueLevelList,
			DepartmentList departmentList) {
		super();
		this.authorCriteria = authorCriteria;
		this.titleCriteria = titleCriteria;
		this.publisherNameCriteria = publisherNameCriteria;
		this.keywordCritera = keywordCritera;
		this.pubDateRangeCriteria = pubDateRangeCriteria;
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

	public KeywordCriteria getKeywordCritera() {
		return keywordCritera;
	}

	public PubDateRangeCriteria getPubDateRangeCriteria() {
		return pubDateRangeCriteria;
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
}
