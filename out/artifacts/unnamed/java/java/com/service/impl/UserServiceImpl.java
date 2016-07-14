package java.com.service.impl;



import com.mybatis.dao.UserMapper;
import com.mybatis.pojo.User;
import com.mybatis.pojo.UserExample;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.com.service.UserService;
import java.util.List;


@Service("userService")
public class UserServiceImpl implements UserService {

    private static Logger logger = Logger.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public int  addUser(User user) {
        if (StringUtils.isEmpty(user)){
            user = new User();
        }
       return userMapper.insert(user);
    }

    @Override
    public List<User> getUsers() {
        UserExample example = new UserExample ();
        return null;
    }
}
