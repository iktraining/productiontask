package gLibrary.domain.books.criteria;

public class TitleCriteria {
	private String title;

	public TitleCriteria() {}

	public TitleCriteria(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean hasTitle() {
		if(title == null) {
			return false;
		}
		return true;
	}
}
