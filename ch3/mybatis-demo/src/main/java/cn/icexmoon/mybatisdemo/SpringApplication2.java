package cn.icexmoon.mybatisdemo;

import cn.icexmoon.mybatisdemo.config.SpringConfig;
import cn.icexmoon.mybatisdemo.entity.User;
import cn.icexmoon.mybatisdemo.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mybatis-demo
 * @Package : cn.icexmoon.mybatisdemo
 * @ClassName : .java
 * @createTime : 2023/8/23 11:02
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
public class SpringApplication2 {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ctx.registerShutdownHook();
        UserService userService = ctx.getBean(UserService.class);
        User user = userService.selectById(1);
        System.out.println(user);
    }
}
