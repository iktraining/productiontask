package gLibrary.dataaccess.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import gLibrary.domain.books.techniquelevels.TechniqueLevel;

@Mapper
public interface TechniqueLevelDaoMapper {
	List<TechniqueLevel> findTechniqueLevelList();
}
