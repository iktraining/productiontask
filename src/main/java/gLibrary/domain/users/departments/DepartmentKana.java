package gLibrary.domain.users.departments;

import javax.validation.constraints.Size;

public class DepartmentKana {
	@Size(max=200, min=1)
	private String kana;

	public DepartmentKana(String kana) {
		this.kana = kana;
	}

	public String getKana() {
		return kana;
	}
}
