package gLibrary.domain.books.bookdescriptions;

public class BookDescription {
	private DescriptionText discriptionText;

	public BookDescription() {}

	public BookDescription(DescriptionText discriptionText) {
		this.discriptionText = discriptionText;
	}

	public DescriptionText getDiscriptionText() {
		return discriptionText;
	}

	public void setDiscriptionText(DescriptionText discriptionText) {
		this.discriptionText = discriptionText;
	}
}
