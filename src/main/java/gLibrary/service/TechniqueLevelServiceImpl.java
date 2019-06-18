package gLibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gLibrary.dataaccess.mapper.TechniqueLevelDaoMapper;
import gLibrary.domain.books.techniquelevels.TechniqueLevelList;

@Service("TechniqueLevelServiceImpl")
public class TechniqueLevelServiceImpl implements TechniqueLevelService{
	@Autowired
	TechniqueLevelDaoMapper techniqueLevelDaoMapper;

	public TechniqueLevelList findTechniqueLevelList() {
		return new TechniqueLevelList(techniqueLevelDaoMapper.findTechniqueLevelList());
	}
}
