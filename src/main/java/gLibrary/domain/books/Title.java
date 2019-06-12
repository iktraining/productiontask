package gLibrary.domain.books;

public class Title {
	private TitleText titleText;
	private TitleKana titleKana;

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
}
