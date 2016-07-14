package java.com.controller;

import com.mybatis.pojo.User;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.com.service.UserService;
import java.com.service.impl.UserServiceImpl;


@Controller
@RequestMapping("user")
public class UserController {
    private static Logger logger = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("add")
    public String addUser(User user, HttpServletRequest request) {

        userService.addUser(user);
        return "welcome.html";
    }
}
