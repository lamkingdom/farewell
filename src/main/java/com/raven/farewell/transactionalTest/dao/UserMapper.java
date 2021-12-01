package com.raven.farewell.transactionalTest.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.raven.farewell.transactionalTest.vo.User;

@Mapper
public interface UserMapper {

	@Insert("INSERT INTO user(id, name) VALUES (#{id}, #{name})")
	void saveUser(User user);
}
