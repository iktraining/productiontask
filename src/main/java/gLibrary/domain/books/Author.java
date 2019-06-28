package gLibrary.domain.books;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import gLibrary.domain.validationgroup.ValidGroup1;
import gLibrary.domain.validationgroup.ValidGroup2;

public class Author {
	@NotBlank(groups= ValidGroup1.class)
	@Size(max=400, min=1, groups= ValidGroup2.class)
	private String author;

	public Author() {}

	public Author(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
