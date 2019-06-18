package gLibrary.domain.books;

import gLibrary.domain.users.departments.DepartmentList;

public class RecommendedDepartment{
	private DepartmentList departmentList;

	public RecommendedDepartment() {}

	public RecommendedDepartment(DepartmentList departmentList) {
		this.departmentList = departmentList;
	}

	public DepartmentList getDepartmentList() {
		return departmentList;
	}

	public void setDepartmentList(DepartmentList departmentList) {
		this.departmentList = departmentList;
	}

	@Override
	public String toString() {
		return String.format("RecommendedDepartment [departmentList=%s]", departmentList);
	}


}
