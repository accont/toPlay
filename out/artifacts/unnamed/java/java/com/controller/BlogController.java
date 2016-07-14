package java.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by admin on 2016/3/30.
 */
@Controller
@RequestMapping("blg")
public class BlogController {

    @ResponseBody
    @RequestMapping("/getUser")
    public String getUser(HttpServletRequest request){
        String name = (String)request.getSession().getAttribute("name");
        System.out.println("输入中文的名字11111："+name);
        return "用户登入 ";
    }

    @ResponseBody
    @RequestMapping("/getSession")
    public int  getSession (HttpServletRequest request){
        String name = (String)request.getSession().getAttribute("name");
        String pwd = (String)request.getSession().getAttribute("password");
        if (StringUtils.isEmpty(name) && StringUtils.isEmpty(pwd)){
            return 1;
        }else {
            return 2;
        }
    }


}
