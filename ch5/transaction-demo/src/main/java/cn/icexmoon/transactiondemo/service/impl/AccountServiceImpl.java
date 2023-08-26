package cn.icexmoon.transactiondemo.service.impl;

import cn.icexmoon.transactiondemo.entity.Account;
import cn.icexmoon.transactiondemo.mapper.AccountMapper;
import cn.icexmoon.transactiondemo.service.AccountService;
import cn.icexmoon.transactiondemo.service.LogService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : transaction-demo
 * @Package : cn.icexmoon.transactiondemo.mapper.impl
 * @ClassName : .java
 * @createTime : 2023/8/25 19:26
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private LogService logService;

    @Override
    public Account getAcountByName(String name) {
        return accountMapper.selectByName(name);
    }

    /**
     * 查询并检查账户余额是否足够
     *
     * @param name   账户名称
     * @param amount 将要取出的金额
     */
    private void checkAccountAmountIsEnough(String name, double amount) {
        Account account = accountMapper.selectByName(name);
        if (account == null) {
            throw new RuntimeException("账户 %s 不存在".formatted(name));
        }
        if (account.getAmount() - amount < 0) {
            throw new RuntimeException("账户 %s 的余额不足".formatted(name));
        }
    }

    @Override
    public void transfer(String from, String to, double amount) {
        try {
            //查询并检查转出账户的余额是否足够
            this.checkAccountAmountIsEnough(from, amount);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
            //从转出账户扣款
            accountMapper.delAmount(from, amount);
            int i = 1/0;
            //给转入账户加钱
            accountMapper.addAmount(to, amount);
            System.out.println("转账成功");
        } finally {
            logService.addTransferLog(from, to, amount);
        }
    }

    @Override
    public void saveMoney(String name, double amount) {
        accountMapper.addAmount(name, amount);
        System.out.println("存款成功");
    }

    @Override
    @SneakyThrows
    public void getBackMoney(String name, double amount) {
        //查询并检查账户余额是否足够
        this.checkAccountAmountIsEnough(name, amount);
        Thread.sleep(1000);
        accountMapper.delAmount(name, amount);
        System.out.println("取钱成功");
    }
}
