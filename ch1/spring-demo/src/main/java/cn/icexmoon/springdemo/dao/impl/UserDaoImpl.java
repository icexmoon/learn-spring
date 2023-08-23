package cn.icexmoon.springdemo.dao.impl;

import cn.icexmoon.springdemo.dao.UserDao;

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
public class UserDaoImpl implements UserDao {
    private String name;
    private int age;

    public UserDaoImpl(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("UserDaoImpl.constructor() is called.");
    }

    @Override
    public void save() {
        System.out.println("UserDaoImpl.save() is called.");
        System.out.printf("Name is %s and age is %d%n", name, age);
    }
}
