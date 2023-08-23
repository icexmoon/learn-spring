package cn.icexmoon.springdemo.dao.impl;

import cn.icexmoon.springdemo.dao.UserDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : spring-demo
 * @Package : cn.icexmoon.springdemo.dao.impl
 * @ClassName : .java
 * @createTime : 2023/8/21 11:21
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
public class UserDaoImpl2 implements UserDao, InitializingBean, DisposableBean {
    @Override
    public void save() {
        System.out.println("UserDaoImpl2.save() is called.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("UserDaoImpl2 will be destroyed.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("UserDaoImpl2 has constructed.");
    }
}
