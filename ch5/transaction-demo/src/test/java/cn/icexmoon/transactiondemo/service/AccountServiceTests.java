package cn.icexmoon.transactiondemo.service;

import cn.icexmoon.transactiondemo.config.SpringConfig;
import cn.icexmoon.transactiondemo.mapper.AccountMapper;
import lombok.SneakyThrows;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : transaction-demo
 * @Package : cn.icexmoon.transactiondemo.service
 * @ClassName : .java
 * @createTime : 2023/8/25 19:59
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
@Transactional(transactionManager = "transactionManager")
@Rollback(value = false)
public class AccountServiceTests {
    @Autowired
    private AccountService accountService;
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private AccountMapper accountMapper;

    @Before
    public void initAcounts() {
        accountMapper.setAmount("icexmoon", 1000);
        accountMapper.setAmount("jack", 2000);
    }

    @Test
    @SneakyThrows
    public void testTransfer() {
        this.printAccounts();
        accountService.transfer("jack", "icexmoon", 1000);
        this.printAccounts();
    }

    @Test
    public void testTransfer2() throws InterruptedException {
        this.printAccounts();
        new Thread(() -> {
            accountService.saveMoney("jack", 1000);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            accountService.getBackMoney("jack", 1000);
        }).start();
        new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            accountService.transfer("jack", "icexmoon", 3000);
        }).start();
        Thread.sleep(2000);
        this.printAccounts();
    }

    private void printAccounts() {
        System.out.println(accountService.getAcountByName("icexmoon"));
        System.out.println(accountService.getAcountByName("jack"));
    }

    @Test
    public void test() {
        printAccounts();
    }
}
