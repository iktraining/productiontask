package gLibrary.dataaccess.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginDaoMapper {
	/*@Select("SELECT user_id as userId, password, user_name as usreName, department_code as departmentCode,"
			+ " joining_year as joiningYear, position_code as positionCode, authority_code as authorityCode,"
			+ " FROM users WHERE user_id = #{userId}")
	User findById(@Param("userId") String userId);*/
}
