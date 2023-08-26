package cn.icexmoon.transactiondemo.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : transaction-demo
 * @Package : cn.icexmoon.transactiondemo.service
 * @ClassName : .java
 * @createTime : 2023/8/26 11:53
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
public interface LogService {
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    void addTransferLog(String from, String to, double amount);
}
