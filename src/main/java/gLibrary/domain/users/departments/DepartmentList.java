package gLibrary.domain.users.departments;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.AssertFalse;

import gLibrary.domain.validationgroup.ValidGroup1;

public class DepartmentList {
	@Valid
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

	@AssertFalse(groups = ValidGroup1.class, message = "部署を選択してください")
	public boolean isEmpty() {
		if(departmentList.stream().anyMatch(department -> !department.isEmpty())) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return String.format("DepartmentList [departmentList=%s]", departmentList);
	}
}
