package gLibrary.domain.books;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import gLibrary.domain.validationgroup.ValidGroup1;
import gLibrary.domain.validationgroup.ValidGroup2;

public class TitleText {
	@NotBlank(groups= ValidGroup1.class)
	@Size(max=500, min=1, groups= ValidGroup2.class)
	private String text;

	public TitleText() {}

	public TitleText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
