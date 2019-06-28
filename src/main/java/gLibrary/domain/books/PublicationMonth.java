package gLibrary.domain.books;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.NumberFormat;

import gLibrary.domain.validationgroup.ValidGroup1;
import gLibrary.domain.validationgroup.ValidGroup2;

public class PublicationMonth {
	@NotNull(groups= ValidGroup1.class)
	@Max(value=12, groups= ValidGroup2.class)
	@Min(value=1, groups= ValidGroup2.class)
	@NumberFormat(pattern = "##")
	private Integer month;

	public PublicationMonth() {}

	public PublicationMonth(Integer month) {
		this.month = month;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public boolean hasMonth() {
		if(month == null) {
			return false;
		}
		return true;
	}
}
