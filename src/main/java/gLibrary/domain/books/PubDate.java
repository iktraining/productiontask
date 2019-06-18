package gLibrary.domain.books;

import java.util.Date;

public class PubDate {
	private Date date;
	private PubYear pubYear;
	private PubMonth pubMonth;

	public PubDate() {}

	public PubDate(PubYear pubYear, PubMonth pubMonth) {
		this.pubYear = pubYear;
		this.pubMonth = pubMonth;
	}

	public Date getDate() {
		return date;
	}

	public PubYear getPubYear() {
		return pubYear;
	}

	public PubMonth getPubMonth() {
		return pubMonth;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setPubYear(PubYear pubYear) {
		this.pubYear = pubYear;
	}

	public void setPubMonth(PubMonth pubMonth) {
		this.pubMonth = pubMonth;
	}
}
