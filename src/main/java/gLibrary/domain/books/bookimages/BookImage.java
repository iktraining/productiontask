package gLibrary.domain.books.bookimages;

public class BookImage {
	private ImageNumber imageNumber;
	private ImageUri imageUri;

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
}
