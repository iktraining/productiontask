package gLibrary.service;

import org.springframework.stereotype.Service;

import gLibrary.domain.users.departments.DepartmentList;

@Service
public interface DepartmentService {
	public DepartmentList findDepartmentList();

	/*public HashMap<DepartmentCode, DepartmentName> findAllDepartmentMap();*/
}
