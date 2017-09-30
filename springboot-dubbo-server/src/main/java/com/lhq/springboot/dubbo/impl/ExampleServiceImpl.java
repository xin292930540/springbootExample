package com.lhq.springboot.dubbo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.lhq.springboot.base.enpty.User;
import com.lhq.springboot.base.enpty.UserExample;
import com.lhq.springboot.base.mapper.UserMapper;
import com.lhq.springboot.dubbo.ExampleService;

@Service(version = "1.0.0")
public class ExampleServiceImpl implements ExampleService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> getUserList(UserExample userExample) {
		List<User> users = userMapper.selectByExample(userExample);
		return users;
	}

}
