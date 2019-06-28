package gLibrary.domain.books.publishers;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import gLibrary.domain.validationgroup.ValidGroup1;
import gLibrary.domain.validationgroup.ValidGroup2;

public class PublisherName {
	@NotBlank(groups= ValidGroup1.class)
	@Size(max=400, min=1, groups= ValidGroup2.class)
	private String name;

	public PublisherName() {}

	public PublisherName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
