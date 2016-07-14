package java.com.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.com.utils.Base64ForWorld;
import java.io.*;

/**
 * Created by admin on 2016/3/23.
 */
@Controller
@RequestMapping("/")
public class IndexController extends Base64ForWorld {

    private  static Logger logger = Logger.getLogger(IndexController.class);
    @RequestMapping("/")
    public String list(){
        return "index.html";
    }

    @RequestMapping("login")
    public String login(HttpServletRequest request,HttpServletResponse response){
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        HttpSession session =  request.getSession();
        String string =  encoding(password);
        System.out.println("加密的密码是 ： "+ string);
        session.setAttribute("name",name);
        session.setAttribute("password",password);
        System.out.println(name + "======" + password + "      ");
        return "blog.html";
    }

    @RequestMapping("doUpload")
    public String UploadFile (HttpServletRequest request,ModelMap mode, HttpServletResponse response,@RequestParam(value = "file", required = false)MultipartFile multipartFile){
        //获取上传路径
        String savePath = request.getSession().getServletContext().getRealPath("upload");
        System.out.println("获取文件名 " + multipartFile.getOriginalFilename());
        //获取文件名
        String filename = multipartFile.getOriginalFilename();
        if (StringUtils.isEmpty(filename)){
            return  "err.html";
        }else{
            //获取完整路径名，包含文件名
            //  String path = savePath + File.separator + filename;
            //创建上传存放文件夹
            File upFile = new File(savePath,filename);
            //    System.out.println("path:" + path + "  ");
            //  File file = new File(savePath);
            //判断上传文件是否存在
            if (!upFile.exists() && !upFile.isDirectory()){
                System.out.println("目录不存在，咱创建个");
                // file.mkdir();
                upFile.mkdirs();
            }
            try {
                multipartFile.transferTo(upFile);
                upFile.delete();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return  "index.html";
        }

      //  mode.addAttribute("fileUrl", request.getContextPath()+"/upload/"+filename);

    }

    @RequestMapping("doDownload")
    public String doDownload(HttpServletRequest request,HttpServletResponse response){
        String loadPath = request.getSession().getServletContext().getRealPath("load");
        String fileName = request.getParameter("fileName");
        response.setHeader("Location",fileName);
        response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
        try {
            OutputStream out = response.getOutputStream();
            File file = new File(loadPath,fileName);
            if (!file.exists() && !file.isDirectory()) {
                file.mkdirs();
            }
            InputStream  in = new FileInputStream(file);
            byte [] b = new byte[1024];
            int i = -1;
            while((i = in.read(b))!=1 ){
                out.write(b,0,i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "index.html";
    }

    @RequestMapping("account")
    public String toUser(){
        logger.info("运行跳转");
        return "accont.html";
    }

    @RequestMapping("heading")
    public String head(){
        logger.info("头页面");
        return "heading.html";
    }

    @RequestMapping("copyright")
    public String copyRight(){
        logger.info("尾页面");
        return "copyright.html";
    }

}
