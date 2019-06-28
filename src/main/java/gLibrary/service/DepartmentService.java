package gLibrary.service;

import java.util.List;

import org.springframework.stereotype.Service;

import gLibrary.domain.users.departments.DepartmentList;
import gLibrary.domain.users.departments.DepartmentName;

@Service
public interface DepartmentService {
	public DepartmentList findDepartmentList();
	public List<DepartmentName> findDepartmentNames(DepartmentList departmentList);

	/*public HashMap<DepartmentCode, DepartmentName> findAllDepartmentMap();*/
}
