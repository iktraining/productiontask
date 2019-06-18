package gLibrary.domain.users.departments;

import java.util.List;

public class DepartmentList {
	private List<Department> departmentList;

	public DepartmentList() {}

	public DepartmentList(List<Department> departmentList) {
		this.departmentList = departmentList;
	}

	public List<Department> getDepartmentList(){
		return departmentList;
	}

	public void setDepartmentList(List<Department> departmentList) {
		this.departmentList = departmentList;
	}

	@Override
	public String toString() {
		return String.format("DepartmentList [departmentList=%s]", departmentList);
	}
}
