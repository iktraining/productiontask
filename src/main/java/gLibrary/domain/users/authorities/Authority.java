package gLibrary.domain.users.authorities;

public class Authority {
	private AuthorityCode authorityCode;
	private AuthorityName authorityName;

	public Authority(AuthorityCode authorityCode, AuthorityName authorityName) {
		this.authorityCode = authorityCode;
		this.authorityName = authorityName;
	}

	public AuthorityCode getDepartmentCode() {
		return authorityCode;
	}

	public AuthorityName getDepartmentName() {
		return authorityName;
	}
}
