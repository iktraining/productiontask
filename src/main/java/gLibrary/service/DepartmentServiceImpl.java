package gLibrary.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gLibrary.dataaccess.mapper.DepartmentDaoMapper;
import gLibrary.domain.users.departments.Department;
import gLibrary.domain.users.departments.DepartmentList;
import gLibrary.domain.users.departments.DepartmentName;

@Service("DepartmentServiceImpl")
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	DepartmentDaoMapper departmentDaoMapper;

	@Override
	public DepartmentList findDepartmentList() {
		return new DepartmentList(departmentDaoMapper.findDepartmentList());
	}

	@Override
	public List<DepartmentName> findDepartmentNames(DepartmentList departmentList) {
		List<String> codes = new ArrayList<>();
		for(Department department: departmentList.getDepartmentList()) {
			codes.add(department.getDepartmentCode().getCode());
		}
		return departmentDaoMapper.findDepartmentNames(codes);
	}
}
