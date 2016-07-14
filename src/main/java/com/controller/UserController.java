package com.controller;

import com.mybatis.pojo.User;
import com.mybatis.pojo.UserExample;
import com.service.UserService;
import com.utils.Base64ForWorld;
import com.utils.Md5Hash;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("user")
public class UserController extends Md5Hash {
    private static Logger logger = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    //跳转登陆页面
    @RequestMapping("forLogin")
    public String forLogin(HttpServletRequest request){
        return "login.jsp";
    }

    //登陆
    @RequestMapping("login")
    public String doLogin(HttpServletRequest request,HttpServletResponse response){
        String username = request.getParameter("userName");
        String password = request.getParameter("password");
        Map<String, Object> map = new HashMap<String, Object>();
        if (!StringUtils.isEmpty(username)){
            map.put("username",username);
        }
        if (!StringUtils.isEmpty(password)){
            String pwd = md5(password);
            map.put("password",pwd);
        }

        User user = userService.selectByLogin(map);
        request.getSession().setAttribute("user",user);
        if (StringUtils.isEmpty(user)){
            request.setAttribute("err","<span style=\"color: red\">您输入的账号或者密码不对，请重新输入~~</span>");
            return "login.jsp";
        }
        return "redirect:/";
    }

    @RequestMapping("list")
    public String list(HttpServletRequest request){
      List<User> users = userService.getListUser(new UserExample());
        request.setAttribute("users",users);
        String id= request.getParameter("id");
        logger.info("id:>>>>>>>>>>"+id);
        return "messages/push.jsp";
    }

    //添加用户
    @RequestMapping("add")
    public String addUser(User user, HttpServletRequest request) {
        String name = request.getParameter("name");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        String pwd = md5(password);
        user.setUsername(userName);
        user.setPassword(pwd);
        user.setName(name);
        userService.addUser(user);
        return "redirect:/";
    }
    //ajax验证用户是否已经注册
    @ResponseBody
    @RequestMapping(value = "check",method = RequestMethod.POST)
    public int checkUser(String userName,HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userName",userName);
        User user = userService.getUsers(map);
        if (StringUtils.isEmpty(user)){
            return 0;
        }else {
            return 1;
        }
    }

}
