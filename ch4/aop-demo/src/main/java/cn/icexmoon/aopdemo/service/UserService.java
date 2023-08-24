package cn.icexmoon.aopdemo.service;

import cn.icexmoon.aopdemo.entity.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : aop-demo
 * @Package : cn.icexmoon.aopdemo.service
 * @ClassName : .java
 * @createTime : 2023/8/24 15:34
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
public interface UserService {
    void add(User user);

    void deleteById(int id);

    void printMsg(String msg);
}
