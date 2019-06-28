package gLibrary.service;

import java.util.List;

import org.springframework.stereotype.Service;

import gLibrary.domain.books.techniquelevels.Grade;
import gLibrary.domain.books.techniquelevels.TechniqueLevelList;

@Service
public interface TechniqueLevelService {
	public TechniqueLevelList findTechniqueLevelList();
	public List<Grade> findGrades(TechniqueLevelList techniqueLevelList);
}
