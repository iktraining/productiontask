package gLibrary.domain.books.techniquelevels;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.AssertFalse;

import gLibrary.domain.validationgroup.ValidGroup1;

public class TechniqueLevelList {
	@Valid
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

	@AssertFalse(groups = ValidGroup1.class,message="技術レベルを選択してください")
	public boolean isEmpty() {
		if(techniqueLevelList.stream().anyMatch(
				(TechniqueLevel techniquelLevel) -> { return !techniquelLevel.isEmpty(); }
				)
		) {
			return false;
		}
		return true;
	}
}
