package gLibrary.domain.books.criteria;

public class KeywordCriteria {
	private String keyword;

	public KeywordCriteria() {}

	public KeywordCriteria(String keyword) {
		this.keyword = keyword;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
}
