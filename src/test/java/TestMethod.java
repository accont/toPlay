import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatis.pojo.User;
import com.mybatis.pojo.UserExample;
import com.service.UserService;
import com.utils.PageHelp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring.xml","classpath*:spring-app.xml",
        "classpath*:mvc-dispatcher-servlet.xml"})
public class TestMethod extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private UserService userService;

    @Test
    public void ttttttt(){
        User user = new User();
        user.setId(2);
        user.setName("test");
        user.setUsername("oneTest");
        user.setPassword("12222");
        userService.addUser(user);

    }
    @Test
    public void setUserService(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("username","admin");
        map.put("password","123");
        User user = userService.selectByLogin(map);
        logger.info("user: "+user);
    }

    @Test
    public void fenye(){

        //PageHelper.startPage(1,3);
        List<User> list = userService.getListUser(new UserExample());
        int pageIndex = 0;
      /*  String pageIndexStr=req.getParameter("pageIndex");
        if(pageIndexStr!=null){
            try{
                pageIndex=Integer.parseInt(pageIndexStr);
            }catch (Exception e) {
            }
        }*/

        PageHelp<User> pageHelp = new PageHelp<User>(pageIndex,list.size(),5);
        pageHelp.init();
        System.out.println(pageHelp);
        //  PageInfo pageInfo = new PageInfo(list);
        for (int i = 0 ; i <list.size();i++){
          //  System.out.println(user.getName());
            System.out.println( pageHelp.toString());
        }
    }
}
