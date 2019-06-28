package gLibrary.domain.books.criteria;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import gLibrary.domain.books.PublicationMonth;
import gLibrary.domain.books.PublicationYear;

public class PublicationFromDateCriteria {

	private PublicationYear publicationYear;
	private PublicationMonth publicationMonth;

	public PublicationFromDateCriteria() {}

	public PublicationFromDateCriteria(PublicationYear publicationYear, PublicationMonth publicationMonth) {
		this.publicationYear = publicationYear;
		this.publicationMonth = publicationMonth;
	}

	public PublicationYear getPublicationYear() {
		return publicationYear;
	}

	public PublicationMonth getPublicationMonth() {
		return publicationMonth;
	}

	public void setPublicationYear(PublicationYear publicationYear) {
		this.publicationYear = publicationYear;
	}

	public void setPublicationMonth(PublicationMonth publicationMonth) {
		this.publicationMonth = publicationMonth;
	}

	//検索条件を持っているかの判別
	public boolean isEmpty() {
		if (publicationYear.hasYear() || publicationMonth.hasMonth()) {
			return false;
		}
		return true;
	}

	public boolean isNotEmpty() {
		return !isEmpty();
	}

	public Date getDate() {
		if (publicationYear.hasYear() && publicationMonth.hasMonth()) {
			return dateFormat(publicationYear.getYear(), publicationMonth.getMonth());
		}
		if (publicationYear.hasYear() && !publicationMonth.hasMonth()) {
			return dateFormat(publicationYear.getYear(), 1);
		}
		if (!publicationYear.hasYear() && publicationMonth.hasMonth()) {
			return dateFormat(1970, publicationMonth.getMonth());
		}
		return null;
	}

	private Date dateFormat(Integer year, Integer month) {
		Calendar calendar = new GregorianCalendar();
		calendar.set(year, month-1, 1);
		return calendar.getTime();
	}
}
