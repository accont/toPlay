package java.com.service;


import com.mybatis.pojo.User;

import java.util.List;

/**
 * Created by admin on 2016/3/23.
 */
public interface UserService {
    int  addUser(User user);

    List<User> getUsers();
}
