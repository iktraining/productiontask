package gLibrary.domain.books.criteria;

public class PubDateRangeCriteria {
	private PubFromCriteria pubFromCriteria;
	private PubToCriteria pubToCriteria;

	public PubDateRangeCriteria(PubFromCriteria pubFromCriteria, PubToCriteria pubToCriteria) {
		this.pubFromCriteria = pubFromCriteria;
		this.pubToCriteria = pubToCriteria;
	}

	public PubFromCriteria getPubFromCriteria() {
		return pubFromCriteria;
	}

	public PubToCriteria getPubToCriteria() {
		return pubToCriteria;
	}
}
