package cn.icexmoon.transactiondemo.service.impl;

import cn.icexmoon.transactiondemo.mapper.LogMapper;
import cn.icexmoon.transactiondemo.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : transaction-demo
 * @Package : cn.icexmoon.transactiondemo.service.impl
 * @ClassName : .java
 * @createTime : 2023/8/26 11:54
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogMapper logMapper;

    @Override
    public void addTransferLog(String from, String to, double amount) {
        logMapper.addLog("%s 转账 %.2f 到 %s".formatted(from, amount, to));
    }
}
