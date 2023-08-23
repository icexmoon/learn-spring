package cn.icexmoon.mybatisdemo.service;

import cn.icexmoon.mybatisdemo.entity.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mybatis-demo
 * @Package : cn.icexmoon.mybatisdemo.service
 * @ClassName : .java
 * @createTime : 2023/8/23 11:58
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
public interface UserService {
    User selectById(int id);
}
