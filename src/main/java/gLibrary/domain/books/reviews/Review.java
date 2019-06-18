package gLibrary.domain.books.reviews;

public class Review {
	private ReviewNumber reviewNumber;
	private ReviewText reviewText;

	public Review() {}

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

	public void setReviewNumber(ReviewNumber reviewNumber) {
		this.reviewNumber = reviewNumber;
	}

	public void setReviewText(ReviewText reviewText) {
		this.reviewText = reviewText;
	}
}
