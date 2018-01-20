package com.dada.dmall.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dada.dmall.dao.UserMapper;
import com.dada.dmall.pojo.User;
import com.dada.dmall.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{

	@Resource
	private UserMapper userMapper;
	@Override
	public User getUserById(int userId) {
		
		return this.userMapper.selectByPrimaryKey(userId);
	}

	
}
