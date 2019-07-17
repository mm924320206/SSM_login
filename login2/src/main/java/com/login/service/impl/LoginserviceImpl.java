package com.login.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.login.mybatis.mapper.UserMapper;
import com.login.pojo.User;
import com.login.pojo.UserExample;
import com.login.service.LoginService;

@Service
public class LoginserviceImpl implements LoginService {

	@Autowired
	private UserMapper userMapper;
	
	
	@Override
	public User find(User user) {
		// TODO Auto-generated method stub
		return userMapper.selectByNamePasswd(user.getUsername(), user.getPassword());
	}
	
}
