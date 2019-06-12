package gLibrary.domain.books.contributors;

import java.util.ArrayList;

public class ContributorList {
	private ArrayList<Contributor> contributorList;

	public ContributorList(ArrayList<Contributor> contributorList) {
		this.contributorList = contributorList;
	}

	public ArrayList<Contributor> getContributorList(){
		return contributorList;
	}
}
