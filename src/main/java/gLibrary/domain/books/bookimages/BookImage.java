package gLibrary.domain.books.bookimages;

import javax.validation.Valid;

public class BookImage {
	private ImageNumber imageNumber;
	@Valid
	private ImageUri imageUri;

	public BookImage() {}

	public BookImage(ImageNumber imageNumber, ImageUri imageUri) {
		this.imageNumber = imageNumber;
		this.imageUri = imageUri;
	}

	public ImageNumber getImageNumber() {
		return imageNumber;
	}

	public ImageUri getImageUri() {
		return imageUri;
	}

	public void setImageNumber(ImageNumber imageNumber) {
		this.imageNumber = imageNumber;
	}

	public void setImageUri(ImageUri imageUri) {
		this.imageUri = imageUri;
	}
}
