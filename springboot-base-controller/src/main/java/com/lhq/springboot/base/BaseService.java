package com.lhq.springboot.base;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lhq.springboot.base.enpty.User;
import com.lhq.springboot.base.enpty.UserExample;

@Repository
public interface BaseService {
	List<User> getUsers(UserExample userExample);
}
