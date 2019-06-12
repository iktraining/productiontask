package gLibrary.domain.books.TechniqueLevels;

import java.util.ArrayList;

public class TechniqueLevelList {
	private ArrayList<TechniqueLevel> techniqueLevelList;

	public TechniqueLevelList(ArrayList<TechniqueLevel> techniqueLevelList) {
		this.techniqueLevelList = techniqueLevelList;
	}

	public ArrayList<TechniqueLevel> getTechniqueLevelList(){
		return techniqueLevelList;
	}
}
