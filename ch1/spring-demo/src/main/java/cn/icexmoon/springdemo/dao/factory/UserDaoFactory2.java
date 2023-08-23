package cn.icexmoon.springdemo.dao.factory;

import cn.icexmoon.springdemo.dao.UserDao;
import cn.icexmoon.springdemo.dao.impl.UserDaoImpl2;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : spring-demo
 * @Package : cn.icexmoon.springdemo.dao.factory
 * @ClassName : .java
 * @createTime : 2023/8/21 12:56
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
public class UserDaoFactory2 {
    public UserDao createUserDao(){
        System.out.println("UserDaoFactory2.createUserDao() is called.");
        return new UserDaoImpl2();
    }
}
