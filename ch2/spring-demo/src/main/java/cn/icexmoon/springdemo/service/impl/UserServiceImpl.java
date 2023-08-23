package cn.icexmoon.springdemo.service.impl;

import cn.icexmoon.springdemo.dao.UserDao;
import cn.icexmoon.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

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
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userDaoImpl")
    private UserDao userDao;
    @Value("${name}")
    private String name;

    @Override
    public void save() {
        System.out.println("UserServiceImpl.save() is called.");
        System.out.println("name:" + name);
        userDao.save();
    }
}
