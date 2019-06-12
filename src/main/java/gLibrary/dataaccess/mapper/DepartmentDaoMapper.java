package gLibrary.dataaccess.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import gLibrary.domain.users.departments.Department;
import gLibrary.domain.users.departments.DepartmentCode;
import gLibrary.domain.users.departments.DepartmentKana;
import gLibrary.domain.users.departments.DepartmentName;

@Mapper
public interface DepartmentDaoMapper {
	//@Select("select department_code as \"departmentCode.code\", department_name as \"departmentName.name\", department_kana as \"departmentKana.kana\" from users.departments order by department_code asc")
	List<Department> findDepartmentList();

	@Select("select department_code as code from users.departments order by department_code asc")
	List<DepartmentCode> findDepartmentCodeList();

	@Select("select department_name as name from users.departments order by department_code asc")
	List<DepartmentName> findDepartmentNameList();

	@Select("select department_kana as kana from users.departments order by department_code asc")
	List<DepartmentKana> findDepartmentKanaList();

	/*	@Select("select department_code as code, department_name as name  from users.departments ")
		@MapKey("code")
		Map<String, String> findAllDepartmentMap();*/
}
