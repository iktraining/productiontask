package gLibrary.domain.books;

import gLibrary.domain.books.bookdescriptions.BookDescription;
import gLibrary.domain.books.bookimages.BookImage;
import gLibrary.domain.books.contributors.ContributorList;
import gLibrary.domain.books.publishers.Publisher;
import gLibrary.domain.books.techniquelevels.TechniqueLevelList;

public class Book {
	private Isbn isbn;
	private Title title;
	private Author author;
	private PubDate pubDate;
	private RecommendedDepartment recommendedDepartment;

	private Publisher publisher;
	private BookImage bookImage;
	private BookDescription bookDescription;
	private ContributorList contributorList;
	private TechniqueLevelList techniqueLevelList;

	public Book() {}

	public Book(Isbn isbn, Title title, Author author, PubDate pubDate, RecommendedDepartment recommendedDepartment,
			Publisher publisher, BookImage bookImage, BookDescription bookDescription, ContributorList contributorList,
			TechniqueLevelList techniqueLevelList) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.pubDate = pubDate;
		this.recommendedDepartment = recommendedDepartment;
		this.publisher = publisher;
		this.bookImage = bookImage;
		this.bookDescription = bookDescription;
		this.contributorList = contributorList;
		this.techniqueLevelList = techniqueLevelList;
	}

	public Isbn getIsbn() {
		return isbn;
	}

	public Title getTitle() {
		return title;
	}

	public Author getAuthor() {
		return author;
	}

	public PubDate getPubDate() {
		return pubDate;
	}

	public RecommendedDepartment getRecommendedDepartment() {
		return recommendedDepartment;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public BookImage getBookImage() {
		return bookImage;
	}

	public BookDescription getBookDescription() {
		return bookDescription;
	}

	public ContributorList getContributorList() {
		return contributorList;
	}

	public TechniqueLevelList getTechniqueLevelList() {
		return techniqueLevelList;
	}

	public void setIsbn(Isbn isbn) {
		this.isbn = isbn;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void setPubDate(PubDate pubDate) {
		this.pubDate = pubDate;
	}

	public void setRecommendedDepartment(RecommendedDepartment recommendedDepartment) {
		this.recommendedDepartment = recommendedDepartment;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public void setBookImage(BookImage bookImage) {
		this.bookImage = bookImage;
	}

	public void setBookDescription(BookDescription bookDescription) {
		this.bookDescription = bookDescription;
	}

	public void setContributorList(ContributorList contributorList) {
		this.contributorList = contributorList;
	}

	public void setTechniqueLevelList(TechniqueLevelList techniqueLevelList) {
		this.techniqueLevelList = techniqueLevelList;
	}

	@Override
	public String toString() {
		return String.format(
				"Book [isbn=%s, title=%s, author=%s, pubDate=%s, recommendedDepartment=%s, publisher=%s, bookImage=%s, bookDescription=%s, contributorList=%s, techniqueLevelList=%s]",
				isbn, title, author, pubDate, recommendedDepartment, publisher, bookImage, bookDescription,
				contributorList, techniqueLevelList);
	}


}
