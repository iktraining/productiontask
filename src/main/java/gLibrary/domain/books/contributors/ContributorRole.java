package gLibrary.domain.books.contributors;

public class ContributorRole {
	private ContributorRoleCode contributorRoleCode;
	private ContributorRoleName contributorRoleName;

	public ContributorRole(ContributorRoleCode contributorRoleCode, ContributorRoleName contributorRoleName) {
		this.contributorRoleCode = contributorRoleCode;
		this.contributorRoleName = contributorRoleName;
	}

	public ContributorRoleCode getContributorRoleCode() {
		return contributorRoleCode;
	}

	public ContributorRoleName getContributorRoleName() {
		return contributorRoleName;
	}
}
