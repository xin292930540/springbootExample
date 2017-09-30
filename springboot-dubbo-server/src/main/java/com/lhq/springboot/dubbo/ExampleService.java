package com.lhq.springboot.dubbo;

import java.util.List;

import com.lhq.springboot.base.enpty.User;
import com.lhq.springboot.base.enpty.UserExample;

public interface ExampleService {
List<User> getUserList(UserExample userExample);
}
