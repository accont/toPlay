package com.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatis.pojo.Blog;
import com.mybatis.pojo.ExtBlog;
import com.mybatis.pojo.OperateUpDown;
import com.mybatis.pojo.User;
import com.service.BlogService;
import com.service.ExtOperateUpDownService;
import com.utils.PageHelp;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("blg")
public class BlogController extends BaseController{

    private static Logger logger = Logger.getLogger(BlogController.class);

    @Autowired
    private BlogService blogService;

    @Autowired
    private ExtOperateUpDownService extOperateUpDownService;

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


    //跳转列表
    @RequestMapping("toList")
    public String toList(){
        return "messages/push.jsp";
    }

    @RequestMapping("list")
    public String list(HttpServletRequest request) throws UnknownHostException {
        int pageIndex = 0;
        String pageIndexStr=request.getParameter("pageIndex");
        if(pageIndexStr!=null){
            try{
                pageIndex=Integer.parseInt(pageIndexStr);
            }catch (Exception e) {
                System.out.println("抛出异常："+e);
            }

        }
        int size = blogService.selectCount();
        PageHelp<ExtBlog> page = new PageHelp<ExtBlog>(pageIndex,size,5);
        int count = (page.getCount()/page.getPageCount()) + 1;
        page.init();
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("start",(page.getPageIndex()-1)*5);
        map.put("end",page.getPageCount());

        List<ExtBlog> list = blogService.getBlogList(map);

        if (!StringUtils.isEmpty(list)){
            request.setAttribute("blog",list);
            if (count!=0){
                request.setAttribute("count",count);
            }
            request.setAttribute("page",page);
           // request.setAttribute("page", new PageInfo<ExtBlog>(list));
        }
        return "messages/list.jsp";
    }

    @RequestMapping("blogAdd")
    public String blogAdd(HttpServletRequest request,Blog blog){

        if (StringUtils.isEmpty(blog)){
            blog = new Blog();
        }
        String title = request.getParameter("title");
        String message = request.getParameter("message");
        String type = request.getParameter("type");
        blog.setMessage(message);
        blog.setTitle(title);
        blog.setType(type);
        blog.setPushDate(new Date());
        User user = (User)request.getSession().getAttribute("user");
        if (!StringUtils.isEmpty(user)){
            blog.setUserId(user.getId());
        }
        try{
        if (StringUtils.isEmpty(request.getSession().getAttribute("user"))){
            request.setAttribute("messages","您还没有登入，不能发布~~，请先登入<br>");
            return "messages/push.jsp";
        }
            int i = blogService.addBlog(blog);
            if (i>0){
                return "redirect:/";
            }
        }catch (Exception e){
            logger.info("添加博文异常: "+ e);
        }
        return "";
    }

    @RequestMapping("item")
    public String item(HttpServletRequest request){
        String s = request.getParameter("id");
        int id = Integer.parseInt(s);
        ExtBlog extBlog = blogService.getById(id);
        logger.info(id);
        if (!StringUtils.isEmpty(extBlog)){
            request.setAttribute("extBlog",extBlog);
            return "messages/item.jsp";
        }else {
            return "/";
        }
    }



    //博客点赞
    @ResponseBody
    @RequestMapping("thumb")
    public OperateUpDown thumb(HttpServletRequest request,@RequestParam(value="id", required=true) int id){
        OperateUpDown operateUpDown = null ;
        Map<String,Object> map = new HashMap<String, Object>();
        User user = (User)request.getSession().getAttribute("user");
        map.put("upIp",getIp(request));
        map.put("downIp",getIp(request));
        map.put("blogId",id);
        operateUpDown = extOperateUpDownService.selectCount(map);
        if (!StringUtils.isEmpty(user)){
            operateUpDown.setuId(user.getId());
        }
        if (StringUtils.isEmpty(operateUpDown)){
            operateUpDown = new OperateUpDown();
            operateUpDown.setBlogId(id);
            operateUpDown.setUpIp(getIp(request));
            operateUpDown.setDownIp(getIp(request));
            operateUpDown.setThumb(1);
            extOperateUpDownService.insertThumb(operateUpDown);
            return operateUpDown;
        }else {
            operateUpDown = extOperateUpDownService.selectThumb(map);
            if (StringUtils.isEmpty(operateUpDown)){
                extOperateUpDownService.updateThumb();
                return operateUpDown;
            }else {
                return operateUpDown;
            }
        }
        }

 /*   @ResponseBody
    @RequestMapping("countThumb")
    public int countThumb (HttpServletRequest request,int id){
       int i =  extOperateUpDownService.countThumb(id);
        return 1;
    }*/


}
