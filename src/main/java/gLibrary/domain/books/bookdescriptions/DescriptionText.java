package gLibrary.domain.books.bookdescriptions;

import javax.validation.constraints.Size;

import gLibrary.domain.validationgroup.ValidGroup1;

public class DescriptionText {
	@Size(max=1000, groups= ValidGroup1.class)
	private String text;

	public DescriptionText() {}

	public DescriptionText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
