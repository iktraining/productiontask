package gLibrary.service;

import org.springframework.stereotype.Service;

import gLibrary.domain.books.techniquelevels.TechniqueLevelList;

@Service
public interface TechniqueLevelService {
	public TechniqueLevelList findTechniqueLevelList();
}
