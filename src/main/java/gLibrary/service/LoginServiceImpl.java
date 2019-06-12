package gLibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gLibrary.dataaccess.mapper.LoginDaoMapper;


@Service("LoginServiceImpl")
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginDaoMapper loginDaoMapper;

	/*
	@Override
	public User findById(String userId) {
		return loginDaoMapper.findById(userId);
	}
	*/
}
