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
	public Department() {}

	public DepartmentCode getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(DepartmentCode departmentCode) {
		this.departmentCode = departmentCode;
	}

	public void setDepartmentName(DepartmentName departmentName) {
		this.departmentName = departmentName;
	}

	public void setDepartmentKana(DepartmentKana departmentKana) {
		this.departmentKana = departmentKana;
	}

	public DepartmentName getDepartmentName() {
		return departmentName;
	}

	public DepartmentKana getDepartmentKana() {
		return departmentKana;
	}
	@Override
	public String toString() {
		return String.format("Department [departmentCode=%s, departmentName=%s, departmentKana=%s]", departmentCode,
				departmentName, departmentKana);
	}


}
