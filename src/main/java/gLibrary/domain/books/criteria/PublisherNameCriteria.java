package gLibrary.domain.books.criteria;

public class PublisherNameCriteria {
	private String name;

	public PublisherNameCriteria() {}

	public PublisherNameCriteria(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public boolean hasName() {
		if(name == null) {
			return false;
		}
		return true;
	}

}
