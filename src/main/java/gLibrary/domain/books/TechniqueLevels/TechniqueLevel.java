package gLibrary.domain.books.techniquelevels;

import javax.validation.Valid;

public class TechniqueLevel {
	@Valid
	private TechniqueRank techniqueRank;

	private Grade grade;

	public TechniqueLevel() {
		this.techniqueRank =  new TechniqueRank();
		this.grade = new Grade();
	}

	public TechniqueLevel(TechniqueRank techniqueRank, Grade grade) {
		this.techniqueRank = techniqueRank;
		this.grade = grade;
	}

	public TechniqueRank getTechniqueRank() {
		return techniqueRank;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setTechniqueRank(TechniqueRank techniqueRank) {
		this.techniqueRank = techniqueRank;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public boolean isEmpty() {
		return techniqueRank.isEmpty();
	}
}