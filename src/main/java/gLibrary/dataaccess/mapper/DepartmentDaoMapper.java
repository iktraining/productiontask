package gLibrary.dataaccess.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import gLibrary.domain.users.departments.Department;

@Mapper
public interface DepartmentDaoMapper {
	List<Department> findDepartmentList();

	/*	@Select("select department_code as code, department_name as name  from users.departments ")
		@MapKey("code")
		Map<String, String> findAllDepartmentMap();*/
}
