package gLibrary.domain.users;

import java.util.ArrayList;

public class UserList {
	private ArrayList<User> userList;

	public UserList(ArrayList<User> userList) {
		this.userList = userList;
	}

	public ArrayList<User> getUserList(){
		return userList;
	}
}
