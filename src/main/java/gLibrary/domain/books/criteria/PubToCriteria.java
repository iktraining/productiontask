package gLibrary.domain.books.criteria;

import java.util.Date;

public class PubToCriteria {
	private Date date;

	public PubToCriteria() {}

	public PubToCriteria(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
