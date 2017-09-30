package com.lhq.springboot.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lhq.springboot.base.enpty.User;
import com.lhq.springboot.base.enpty.UserExample;

@RestController
public class BaseController {
	@Autowired
	BaseService baseService;

	@RequestMapping("test")
	public List<User> getUsers() {
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUserEqualTo("root");
		return baseService.getUsers(userExample);
	}

}
