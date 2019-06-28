package gLibrary.domain.books;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.NumberFormat;

import gLibrary.domain.validationgroup.ValidGroup1;
import gLibrary.domain.validationgroup.ValidGroup2;

public class PublicationYear {
	@NotNull(groups= ValidGroup1.class)
	@Max(value=9999, groups= ValidGroup2.class)
	@Min(value=1970, groups= ValidGroup2.class)
	@NumberFormat(pattern = "####")
	private Integer year;

	public PublicationYear() {}

	public PublicationYear(Integer year) {
		this.year = year;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public boolean hasYear() {
		if(year == null) {
			return false;
		}
		return true;
	}
}
