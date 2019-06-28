package gLibrary.domain.books.criteria;

public class AuthorCriteria {
	private String author;

	public AuthorCriteria() {}

	public AuthorCriteria(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean hasAuthor() {
		if(author == null) {
			return false;
		}
		return true;
	}

}
