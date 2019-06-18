package gLibrary.domain.books.techniquelevels;

import java.util.List;

public class TechniqueLevelList {
	private List<TechniqueLevel> techniqueLevelList;

	public TechniqueLevelList() {}

	public TechniqueLevelList(List<TechniqueLevel> techniqueLevelList) {
		this.techniqueLevelList = techniqueLevelList;
	}

	public List<TechniqueLevel> getTechniqueLevelList(){
		return techniqueLevelList;
	}

	public void setTechniqueLevelList(List<TechniqueLevel> techniqueLevelList) {
		this.techniqueLevelList = techniqueLevelList;
	}
}
