package gLibrary.domain.books.techniquelevels;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Grade {
	@NotEmpty
	@Size(max=100, min=1)
	private String grade;

	public Grade() {}

	public Grade(String grade) {
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}
