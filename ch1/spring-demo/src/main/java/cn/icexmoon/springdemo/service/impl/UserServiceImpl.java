package cn.icexmoon.springdemo.service.impl;

import cn.icexmoon.springdemo.dao.UserDao;
import cn.icexmoon.springdemo.service.UserService;
import lombok.Setter;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : spring-demo
 * @Package : cn.icexmoon.springdemo.service.impl
 * @ClassName : .java
 * @createTime : 2023/8/21 11:07
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
public class UserServiceImpl implements UserService {
    @Setter
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save(){
        System.out.println("UserServiceImpl.save() is called.");
        userDao.save();
    }

    public UserServiceImpl() {
        System.out.println("UserServiceImpl's constructor is called.");
    }
}
