package com.service.impl;




import com.dao.ExtUserMapper;
import com.mybatis.dao.*;
import com.mybatis.pojo.User;
import com.mybatis.pojo.UserExample;
import com.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@Service
public class UserServiceImpl implements UserService {

    private static Logger logger = Logger.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ExtUserMapper extUserMapper;

    @Override
    public int  addUser(User user) {
        if (StringUtils.isEmpty(user)){
            user = new User();
        }
       return userMapper.insertSelective(user);
    }

    @Override
    public User getUsers(Map<String,Object> map) {

        return extUserMapper.getByName(map);
    }

    @Override
    public User selectByLogin(Map<String, Object> map) {
        return extUserMapper.selectByLogin(map);
    }

    @Override
    public List<User> getListUser(UserExample example) {
        return userMapper.selectByExample(example);
    }


}
