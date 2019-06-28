package gLibrary.domain.books;

import javax.validation.Valid;

public class Title {
	@Valid
	private TitleText titleText;

	@Valid
	private TitleKana titleKana;

	public Title() {}

	public Title(TitleText titleText, TitleKana titleKana) {
		this.titleText = titleText;
		this.titleKana = titleKana;
	}

	public TitleText getTitleText() {
		return titleText;
	}

	public TitleKana getTitleKana() {
		return titleKana;
	}

	public void setTitleText(TitleText titleText) {
		this.titleText = titleText;
	}

	public void setTitleKana(TitleKana titleKana) {
		this.titleKana = titleKana;
	}
}
