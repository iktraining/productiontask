package gLibrary.domain.books.reviews;

public class Review {
	private ReviewNumber reviewNumber;
	private ReviewText reviewText;

	public Review(ReviewNumber reviewNumber, ReviewText reviewText) {
		this.reviewNumber = reviewNumber;
		this.reviewText = reviewText;
	}

	public ReviewNumber getReviewNumber() {
		return reviewNumber;
	}

	public ReviewText getReviewText() {
		return reviewText;
	}
}
