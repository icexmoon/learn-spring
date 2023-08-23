package cn.icexmoon.mybatisdemo.service;

import cn.icexmoon.mybatisdemo.config.SpringConfig;
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
 * @Project : mybatis-demo
 * @Package : cn.icexmoon.mybatisdemo.service
 * @ClassName : .java
 * @createTime : 2023/8/23 13:32
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
//设置类运行器
@RunWith(SpringJUnit4ClassRunner.class)
//指定上下文配置
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testSelectById(){
        System.out.println(userService.selectById(1));
    }
}
