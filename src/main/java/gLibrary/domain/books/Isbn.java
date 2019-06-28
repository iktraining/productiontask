package gLibrary.domain.books;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import gLibrary.domain.validationgroup.ValidGroup1;
import gLibrary.domain.validationgroup.ValidGroup2;
import gLibrary.domain.validationgroup.ValidGroup3;

public class Isbn {
	@NotBlank(groups = ValidGroup1.class)
	@Pattern(regexp = "[0-9,-]+", groups=ValidGroup2.class)
	@Size(max=17, min=10, groups=ValidGroup3.class)
	private String isbn;

	public Isbn() {}

	public Isbn(String isbn) {
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public boolean hasIsbn() {
		if(isbn == null) {
			return false;
		}
		return true;
	}
	public boolean isEmpty() {
		if(isbn == null || isbn == "") {
			return true;
		}
		return false;
	}
}
