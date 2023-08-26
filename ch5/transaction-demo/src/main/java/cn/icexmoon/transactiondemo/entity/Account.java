package cn.icexmoon.transactiondemo.entity;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : transaction-demo
 * @Package : cn.icexmoon.transactiondemo.entity
 * @ClassName : .java
 * @createTime : 2023/8/25 18:44
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Data
public class Account {
    // 账户id
    private Long id;
    // 账户名
    private String name;
    // 金额
    private Double amount;
}
