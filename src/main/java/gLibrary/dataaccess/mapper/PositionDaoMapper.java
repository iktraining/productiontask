package gLibrary.dataaccess.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import gLibrary.domain.users.positions.Position;

@Mapper
public interface PositionDaoMapper {

	@Select("select position_code, position_name, position_kana from users.positions order by position_code")
	Position findPosition();
}
