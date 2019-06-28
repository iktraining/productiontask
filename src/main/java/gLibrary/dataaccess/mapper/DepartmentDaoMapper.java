package gLibrary.dataaccess.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import gLibrary.domain.users.departments.Department;
import gLibrary.domain.users.departments.DepartmentName;

@Mapper
public interface DepartmentDaoMapper {
	List<Department> findDepartmentList();
	List<DepartmentName> findDepartmentNames(List<String> codes);
}
