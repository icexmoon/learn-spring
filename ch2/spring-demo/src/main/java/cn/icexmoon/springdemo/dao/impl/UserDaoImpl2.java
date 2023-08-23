package cn.icexmoon.springdemo.dao.impl;

import cn.icexmoon.springdemo.dao.UserDao;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : spring-demo
 * @Package : cn.icexmoon.springdemo.dao
 * @ClassName : .java
 * @createTime : 2023/8/21 11:08
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Repository
public class UserDaoImpl2 implements UserDao {
    @Override
    public void save(){
        System.out.println("UserDaoImpl2.save() is called.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("before UserDaoImpl2 instance destroy.");
    }

    @PostConstruct
    public void afterPropertiesSet() {
        System.out.println("after UserDaoImpl2 instance init.");
    }
}
