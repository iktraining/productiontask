package gLibrary.domain.books.criteria;

import java.util.Date;

public class PubFromCriteria {
	private Date date;

	public PubFromCriteria() {}

	public PubFromCriteria(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
