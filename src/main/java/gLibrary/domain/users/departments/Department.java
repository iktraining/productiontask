package gLibrary.domain.users.departments;

public class Department {
	private DepartmentCode departmentCode;
	private DepartmentName departmentName;
	private DepartmentKana departmentKana;

	public Department(DepartmentCode departmentCode, DepartmentName departmentName, DepartmentKana departmentKana) {
		this.departmentCode = departmentCode;
		this.departmentName = departmentName;
		this.departmentKana = departmentKana;
	}

	public DepartmentCode getDepartmentCode() {
		return departmentCode;
	}

	public DepartmentName getDepartmentName() {
		return departmentName;
	}

	public DepartmentKana getDepartmentKana() {
		return departmentKana;
	}
}
