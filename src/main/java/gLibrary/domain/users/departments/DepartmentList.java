package gLibrary.domain.users.departments;

import java.util.List;

public class DepartmentList {
	private List<Department> departmentList;

	public DepartmentList(List<Department> departmentList) {
		this.departmentList = departmentList;
	}

	public List<Department> getDepartmentList(){
		return departmentList;
	}
}
