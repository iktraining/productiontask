package gLibrary.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gLibrary.dataaccess.mapper.TechniqueLevelDaoMapper;
import gLibrary.domain.books.techniquelevels.Grade;
import gLibrary.domain.books.techniquelevels.TechniqueLevel;
import gLibrary.domain.books.techniquelevels.TechniqueLevelList;

@Service("TechniqueLevelServiceImpl")
public class TechniqueLevelServiceImpl implements TechniqueLevelService{
	@Autowired
	TechniqueLevelDaoMapper techniqueLevelDaoMapper;

	@Override
	public TechniqueLevelList findTechniqueLevelList() {
		return new TechniqueLevelList(techniqueLevelDaoMapper.findTechniqueLevelList());
	}

	@Override
	public List<Grade> findGrades(TechniqueLevelList techniqueLevelList){
		List<Integer> ranks = new ArrayList<>();
		for(TechniqueLevel techniqueLevel :techniqueLevelList.getTechniqueLevelList()) {
			ranks.add(techniqueLevel.getTechniqueRank().getRank());
		}
		return techniqueLevelDaoMapper.findGrades(ranks);
	}
}
