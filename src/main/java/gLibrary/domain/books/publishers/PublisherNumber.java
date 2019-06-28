package gLibrary.domain.books.publishers;

import javax.validation.constraints.Min;

public class PublisherNumber {
	@Min(1)
	private Integer number;

	public PublisherNumber() {}

	public PublisherNumber(Integer number) {
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
}
