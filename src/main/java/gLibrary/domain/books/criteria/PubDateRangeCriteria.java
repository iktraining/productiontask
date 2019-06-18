package gLibrary.domain.books.criteria;

public class PubDateRangeCriteria {
	private PubFromCriteria pubFromCriteria;
	private PubToCriteria pubToCriteria;

	public PubDateRangeCriteria() {}

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

	public void setPubFromCriteria(PubFromCriteria pubFromCriteria) {
		this.pubFromCriteria = pubFromCriteria;
	}

	public void setPubToCriteria(PubToCriteria pubToCriteria) {
		this.pubToCriteria = pubToCriteria;
	}

}
