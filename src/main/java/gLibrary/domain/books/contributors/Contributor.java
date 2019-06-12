package gLibrary.domain.books.contributors;

public class Contributor {
	private ContributorSequence contributorSequence;
	private ContributorRole contributorRole;
	private ContributorName contributorName;

	public Contributor(ContributorSequence contributorSequence, ContributorRole contributorRole,
			ContributorName contributorName) {
		this.contributorSequence = contributorSequence;
		this.contributorRole = contributorRole;
		this.contributorName = contributorName;
	}

	public ContributorSequence getContributorSequence() {
		return contributorSequence;
	}

	public ContributorRole getContributorRole() {
		return contributorRole;
	}

	public ContributorName getContributorName() {
		return contributorName;
	}
}
