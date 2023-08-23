package cn.icexmoon.mybatisdemo.service.impl;

import cn.icexmoon.mybatisdemo.entity.User;
import cn.icexmoon.mybatisdemo.mapper.UserMapper;
import cn.icexmoon.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mybatis-demo
 * @Package : cn.icexmoon.mybatisdemo.service.impl
 * @ClassName : .java
 * @createTime : 2023/8/23 11:59
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectById(int id) {
        return userMapper.selectById(id);
    }
}
