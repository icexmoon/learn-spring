package cn.icexmoon.transactiondemo.mapper;

import cn.icexmoon.transactiondemo.config.SpringConfig;
import cn.icexmoon.transactiondemo.entity.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : transaction-demo
 * @Package : cn.icexmoon.transactiondemo.mapper
 * @ClassName : .java
 * @createTime : 2023/8/25 19:04
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountMapperTests {
    @Autowired
    AccountMapper accountMapper;

    @Test
    public void testSelectByName() {
        Account account = accountMapper.selectByName("icexmoon");
        System.out.println(account);
    }
}
