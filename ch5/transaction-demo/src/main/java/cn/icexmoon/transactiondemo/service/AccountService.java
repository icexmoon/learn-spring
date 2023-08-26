package cn.icexmoon.transactiondemo.service;

import cn.icexmoon.transactiondemo.entity.Account;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : transaction-demo
 * @Package : cn.icexmoon.transactiondemo.service
 * @ClassName : .java
 * @createTime : 2023/8/25 19:22
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
public interface AccountService {
    /**
     * 查看账户信息
     *
     * @return
     */
    @Transactional
    Account getAcountByName(String name);

    /**
     * 转账
     *
     * @param from   转出账户
     * @param to     转入账户
     * @param amount
     */
    @Transactional
    void transfer(String from, String to, double amount);

    /**
     * 存钱
     *
     * @param name   账户名
     * @param amount 金额
     */
    @Transactional
    void saveMoney(String name, double amount);

    /**
     * 取钱
     *
     * @param name   账户名
     * @param amount 金额
     */
    @Transactional
    void getBackMoney(String name, double amount);
}
