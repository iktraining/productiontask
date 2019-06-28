package gLibrary.domain.users.departments;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class DepartmentName {
	@NotEmpty
	@Size(max=100, min=1)
	private String name;

	public DepartmentName() {}

	public DepartmentName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
