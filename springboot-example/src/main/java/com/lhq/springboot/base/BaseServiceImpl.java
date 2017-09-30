package com.lhq.springboot.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhq.springboot.base.enpty.Springuser;
import com.lhq.springboot.base.enpty.SpringuserExample;
import com.lhq.springboot.base.mapper.SpringuserMapper;

@Service
public class BaseServiceImpl implements BaseService {
	@Autowired
	SpringuserMapper springuserMapper;

	public List<Springuser> getUsers(SpringuserExample springuserExample) {
		return springuserMapper.selectByExample(springuserExample);
	}

}
