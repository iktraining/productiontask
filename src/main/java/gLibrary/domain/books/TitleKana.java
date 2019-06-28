package gLibrary.domain.books;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import gLibrary.domain.validationgroup.ValidGroup1;
import gLibrary.domain.validationgroup.ValidGroup2;

public class TitleKana {
	@NotBlank(groups= ValidGroup1.class)
	@Size(max=1000, min=1, groups= ValidGroup2.class)
	private String kana;

	public TitleKana() {}

	public TitleKana(String kana) {
		this.kana = kana;
	}

	public String getKana() {
		return kana;
	}

	public void setKana(String kana) {
		this.kana = kana;
	}
}
