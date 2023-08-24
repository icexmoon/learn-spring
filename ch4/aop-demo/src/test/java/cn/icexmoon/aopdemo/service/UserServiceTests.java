package cn.icexmoon.aopdemo.service;

import cn.icexmoon.aopdemo.SpringConfig;
import cn.icexmoon.aopdemo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : aop-demo
 * @Package : cn.icexmoon.aopdemo.service
 * @ClassName : .java
 * @createTime : 2023/8/24 15:41
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTests {
    @Autowired
    private UserService userService;

    @Test
    public void testUserAdd(){
        User user = new User();
        user.setName("icexmoon");
        user.setAge(18);
        userService.add(user);
    }

    @Test
    public void testUserDelete(){
        userService.deleteById(1);
    }

    @Test
    public void testPrintMsg(){
        userService.printMsg(" 123  ");
    }
}
