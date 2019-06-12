package gLibrary.domain.books.bookdescriptions;

public class BookDescription {
	private DescriptionText discriptionText;

	public BookDescription(DescriptionText discriptionText) {
		this.discriptionText = discriptionText;
	}

	public DescriptionText getDiscriptionText() {
		return discriptionText;
	}
}
