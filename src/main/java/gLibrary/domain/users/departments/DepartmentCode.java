package gLibrary.domain.users.departments;

import javax.validation.constraints.Size;

import gLibrary.domain.validationgroup.ValidGroup2;

public class DepartmentCode {
	//@NotBlank(groups= ValidGroup1.class)
	@Size(max=50, min=1, groups= ValidGroup2.class)
	private String code;

	public DepartmentCode(String code) {
		this.code = code;
	}
	public DepartmentCode() {}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isEmpty() {
		return code == null;
	}
}
