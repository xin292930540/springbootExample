package com.lhq.springboot.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhq.springboot.base.enpty.User;
import com.lhq.springboot.base.enpty.UserExample;
import com.lhq.springboot.base.mapper.UserMapper;

@Service
public class BaseServiceImpl implements BaseService {
	@Autowired
	UserMapper userMapper;

	public List<User> getUsers(UserExample userExample) {
		return userMapper.selectByExample(userExample);
	}

}
