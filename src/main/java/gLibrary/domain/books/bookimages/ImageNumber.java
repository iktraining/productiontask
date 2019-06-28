package gLibrary.domain.books.bookimages;

import javax.validation.constraints.Min;

public class ImageNumber {
	@Min(1)
	private Integer number;

	public ImageNumber(Integer number) {
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}
}
