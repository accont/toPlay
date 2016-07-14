package com.service;


import com.mybatis.pojo.User;
import com.mybatis.pojo.UserExample;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2016/3/23.
 */
public interface UserService {
    int  addUser(User user);

    User getUsers(Map<String,Object> map);

    User selectByLogin(Map<String,Object> map);

    List<User> getListUser(UserExample example);

}
