package gLibrary.domain.books.publishers;

import javax.validation.Valid;

public class Publisher {
	@Valid
	private PublisherName publisherName;

	private PublisherNumber publisherNumber;

	public Publisher() {}

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

	public void setPublisherName(PublisherName publisherName) {
		this.publisherName = publisherName;
	}

	public void setPublisherNumber(PublisherNumber publisherNumber) {
		this.publisherNumber = publisherNumber;
	}
}
