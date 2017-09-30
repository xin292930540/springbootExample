package com.lhq.springboot.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lhq.springboot.base.enpty.Springuser;
import com.lhq.springboot.base.enpty.SpringuserExample;

@RestController
public class BaseController {
	@Autowired
	BaseService baseService;

	@RequestMapping("test")
	public List<Springuser> getUsers() {
		SpringuserExample springuserExample = new SpringuserExample();
		springuserExample.createCriteria().andAgeIsNotNull();
		
		return baseService.getUsers(springuserExample);
	}

}
