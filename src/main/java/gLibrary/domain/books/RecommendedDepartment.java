package gLibrary.domain.books;

import gLibrary.domain.users.departments.DepartmentList;

public class RecommendedDepartment {
	private DepartmentList departmentList;

	public RecommendedDepartment(DepartmentList departmentList) {
		this.departmentList = departmentList;
	}

	public DepartmentList getDepartmentList() {
		return departmentList;
	}
}
