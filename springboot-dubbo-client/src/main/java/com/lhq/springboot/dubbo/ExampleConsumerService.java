package com.lhq.springboot.dubbo;

import java.util.List;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lhq.springboot.base.enpty.User;
import com.lhq.springboot.base.enpty.UserExample;

public class ExampleConsumerService {

	@Reference(version = "1.0.0")
	ExampleService exampleService;

	public List<User> getUsers(String userName) {
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUserEqualTo(userName);
		return exampleService.getUserList(userExample);
	}

}
