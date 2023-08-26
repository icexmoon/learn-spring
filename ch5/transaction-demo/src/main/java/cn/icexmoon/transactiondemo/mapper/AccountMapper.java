package cn.icexmoon.transactiondemo.mapper;

import cn.icexmoon.transactiondemo.entity.Account;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : transaction-demo
 * @Package : cn.icexmoon.transactiondemo.mapper
 * @ClassName : .java
 * @createTime : 2023/8/25 18:58
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
public interface AccountMapper {
    @Select("select * from account where name=#{name} limit 1;")
    Account selectByName(String name);

    @Update("update account set amount=amount-#{amount} where `name`=#{name}")
    void delAmount(@Param("name") String name, @Param("amount") double amount);

    @Update("update account set amount=amount+#{amount} where `name`=#{name}")
    void addAmount(@Param("name") String name, @Param("amount") double amount);

    @Update("update account set amount=#{amount} where `name`=#{name}")
    void setAmount(@Param("name") String name, @Param("amount") double amount);
}
