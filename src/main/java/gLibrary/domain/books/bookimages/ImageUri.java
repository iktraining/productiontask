package gLibrary.domain.books.bookimages;

import javax.validation.constraints.Pattern;

import gLibrary.domain.validationgroup.ValidGroup1;

public class ImageUri {
	@Pattern(regexp= "^$|.*\\.png$|.*\\.jpg$|.*\\.gif$", groups= ValidGroup1.class)
	private String uri;

	public ImageUri() {}

	public ImageUri(String uri) {
		this.uri = uri;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

}
