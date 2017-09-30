package com.lhq.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lhq.springboot.base.enpty.User;
import com.lhq.springboot.dubbo.ExampleConsumerService;

@RestController
public class BaseController {

	@Autowired
	ExampleConsumerService exampleConsumerService;

	@RequestMapping("test_a")
	public List<User> getUsers(String userName) {
		ExampleConsumerService exampleConsumerService = new ExampleConsumerService();
		return exampleConsumerService.getUsers(userName);
	}

	@RequestMapping("test_b")
	public List<User> getUser(String userName) {
		exampleConsumerService = new ExampleConsumerService();
		return exampleConsumerService.getUsers(userName);
	}

}
