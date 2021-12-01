package com.raven.farewell.transactionalTest.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.raven.farewell.transactionalTest.dao.UserMapper;
import com.raven.farewell.transactionalTest.vo.User;

@Service
public class FirstService {

	@Resource
	private UserMapper userMapper;

//	@Transactional
	public void saveUserInfo() {
		User user = new User();
		user.setId(100);
		user.setName("ni");
		userMapper.saveUser(user);
	}
}
