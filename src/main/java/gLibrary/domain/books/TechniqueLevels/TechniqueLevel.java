package gLibrary.domain.books.TechniqueLevels;

public class TechniqueLevel {
	private TechniqueRank techniqueRank;
	private Grade grade;

	public TechniqueLevel(TechniqueRank techniqueRank, Grade grade) {
		this.techniqueRank = techniqueRank;
		this.grade = grade;
	}

	public TechniqueRank getTechniqueRank() {
		return techniqueRank;
	}

	public Grade gerGrade() {
		return grade;
	}
}
