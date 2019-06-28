package gLibrary.domain.books;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.validation.Valid;

public class PublicationDate {
	private Date date;

	@Valid
	private PublicationYear publicationYear;

	@Valid
	private PublicationMonth publicationMonth;

	public PublicationDate() {}

	public PublicationDate(PublicationYear publicationYear, PublicationMonth publicationMonth) {
		this.publicationYear = publicationYear;
		this.publicationMonth = publicationMonth;
	}

	public PublicationYear getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(PublicationYear publicationYear) {
		this.publicationYear = publicationYear;
	}

	public PublicationMonth getPublicationMonth() {
		return publicationMonth;
	}

	public void setPublicationMonth(PublicationMonth publicationMonth) {
		this.publicationMonth = publicationMonth;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public Date createDate() {
		if (publicationYear.hasYear() && publicationMonth.hasMonth()) {
			return dateFormat(publicationYear.getYear(), publicationMonth.getMonth());
		}
		return null;
	}

	private Date dateFormat(Integer year, Integer month) {
		Calendar calendar = new GregorianCalendar();
		calendar.set(year, month-1, 1);
		return calendar.getTime();
	}
}
