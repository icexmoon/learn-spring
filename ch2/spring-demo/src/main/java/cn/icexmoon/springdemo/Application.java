package cn.icexmoon.springdemo;

import cn.icexmoon.springdemo.config.WebConfig;
import cn.icexmoon.springdemo.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : spring-demo
 * @Package : cn.icexmoon.springdemo
 * @ClassName : .java
 * @createTime : 2023/8/21 11:06
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(WebConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        userService.save();
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}
