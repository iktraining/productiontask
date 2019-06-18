package gLibrary.domain.books.techniquelevels;

public class TechniqueLevel {
	private TechniqueRank techniqueRank;
	private Grade grade;

	public TechniqueLevel() {
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
}
