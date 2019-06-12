package gLibrary.domain.users;

import gLibrary.domain.users.authorities.Authority;
import gLibrary.domain.users.departments.Department;
import gLibrary.domain.users.positions.Position;

public class User {
	private UserId userId;
	private Password password;
	private UserName userName;
	private JoiningYear joiningYear;
	private Authority authority;
	private Position position;
	private Department department;

	public User(UserId userId, Password password, UserName userName, JoiningYear joiningYear,
					Authority authority, Position position, Department department) {
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.joiningYear = joiningYear;
		this.authority = authority;
		this.position = position;
		this.department = department;
	}

	public UserId getUserId() {
		return userId;
	}

	public Password getPassword() {
		return password;
	}

	public UserName getUserName() {
		return userName;
	}

	public JoiningYear getJoiningYear() {
		return joiningYear;
	}

	public Authority getAuthority() {
		return authority;
	}

	public Position getPosition() {
		return position;
	}

	public Department getDepartment() {
		return department;
	}
}
