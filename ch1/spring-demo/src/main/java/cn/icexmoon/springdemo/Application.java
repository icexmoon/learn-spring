package cn.icexmoon.springdemo;

import cn.icexmoon.springdemo.service.CollectionService;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        // 创建 IOC 容器
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        // 注册关闭钩子
        ctx.registerShutdownHook();
        CollectionService collectionService = ctx.getBean(CollectionService.class);
        collectionService.print();
        DruidDataSource druidDataSource = ctx.getBean(DruidDataSource.class);
        System.out.println(druidDataSource);
        System.out.println("username:" + druidDataSource.getUsername());
        System.out.println("password:"+druidDataSource.getPassword());
        System.out.println("url:"+druidDataSource.getUrl());
        System.out.println("driver:"+druidDataSource.getDriverClassName());
    }
}
