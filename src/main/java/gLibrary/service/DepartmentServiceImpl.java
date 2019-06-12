package gLibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gLibrary.dataaccess.mapper.DepartmentDaoMapper;
import gLibrary.domain.users.departments.DepartmentList;

@Service("DepartmentServiceImpl")
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	DepartmentDaoMapper departmentDaoMapper;

	public DepartmentList findDepartmentList() {
		return new DepartmentList(departmentDaoMapper.findDepartmentList());
	}

	/*	public HashMap<DepartmentCode, DepartmentName> findAllDepartmentMap() {
			HashMap<DepartmentCode, DepartmentName> departmentHashMap;

			for(Map.Entry<String,String> entry : departmentDaoMapper.findAllDepartmentMap().entrySet()) {
				DepartmentCode departmentCode = new DepartmentCode(entry.getKey());
				DepartmentName departmentName = new DepartmentName(entry.getValue());
				departmentHashMap.put(departmentCode, departmentName);
			}
			return departmentHashMap;
		}*/

}
