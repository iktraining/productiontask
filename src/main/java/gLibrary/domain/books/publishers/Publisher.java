package gLibrary.domain.books.publishers;

public class Publisher {
	private PublisherName publisherName;
	private PublisherNumber publisherNumber;

	public Publisher(PublisherNumber publisherNumber, PublisherName publisherName) {
		this.publisherNumber = publisherNumber;
		this.publisherName = publisherName;
	}

	public PublisherName getPublisherName() {
		return publisherName;
	}

	public PublisherNumber getPublisherNumber() {
		return publisherNumber;
	}
}
