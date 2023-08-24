package cn.icexmoon.aopdemo.service.impl;

import cn.icexmoon.aopdemo.aspect.annotation.TrimParams;
import cn.icexmoon.aopdemo.service.UserService;
import cn.icexmoon.aopdemo.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : aop-demo
 * @Package : cn.icexmoon.aopdemo.service.impl
 * @ClassName : .java
 * @createTime : 2023/8/24 15:35
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void add(User user) {
        user.setId(1);
        System.out.println("%s was added.".formatted(user));
    }

    @Override
    public void deleteById(int id) {
        System.out.println("User(%d) was deleted.");
    }

    @Override
    @TrimParams
    public void printMsg(String msg) {
        System.out.printf("msg:[%s]%n", msg);
    }
}
