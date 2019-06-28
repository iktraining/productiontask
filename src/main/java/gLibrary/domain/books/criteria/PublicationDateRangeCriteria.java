package gLibrary.domain.books.criteria;

public class PublicationDateRangeCriteria {
	private PublicationFromDateCriteria publicationFromDateCriteria;
	private PublicationToDateCriteria publicationToDateCriteria;

	public PublicationDateRangeCriteria() {}

	public PublicationDateRangeCriteria(PublicationFromDateCriteria publicationFromCriteria, PublicationToDateCriteria publicationToDateCriteria) {
		this.publicationFromDateCriteria = publicationFromCriteria;
		this.publicationToDateCriteria = publicationToDateCriteria;
	}

	public PublicationFromDateCriteria getPublicationFromDateCriteria() {
		return publicationFromDateCriteria;
	}

	public void setPublicationFromDateCriteria(PublicationFromDateCriteria publicationFromDateCriteria) {
		this.publicationFromDateCriteria = publicationFromDateCriteria;
	}

	public PublicationToDateCriteria getPublicationToDateCriteria() {
		return publicationToDateCriteria;
	}

	public void setPublicationToDateCriteria(PublicationToDateCriteria publicationToDateCriteria) {
		this.publicationToDateCriteria = publicationToDateCriteria;
	}
}
