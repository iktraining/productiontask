package gLibrary.domain.books;

import java.util.Date;

public class PubDate {
	private Date date;
	private PubYear pubYear;
	private PubMonth pubMonth;

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

}
