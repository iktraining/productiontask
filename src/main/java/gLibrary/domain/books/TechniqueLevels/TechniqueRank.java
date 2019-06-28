package gLibrary.domain.books.techniquelevels;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import gLibrary.domain.validationgroup.ValidGroup1;

public class TechniqueRank {
	//@NotNull(groups= ValidGroup1.class)
	@Min(value=1, groups= ValidGroup1.class)
	@Max(value=10, groups= ValidGroup1.class)
	private Integer rank;

	public TechniqueRank() {
		super();
	}

	public TechniqueRank(Integer rank) {
		this.rank = rank;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public boolean isEmpty() {
		return rank == null ? true : false;
	}
}
