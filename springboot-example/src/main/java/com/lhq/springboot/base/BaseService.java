package com.lhq.springboot.base;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lhq.springboot.base.enpty.Springuser;
import com.lhq.springboot.base.enpty.SpringuserExample;

@Repository
public interface BaseService {
	List<Springuser> getUsers(SpringuserExample springuserExample);

}
