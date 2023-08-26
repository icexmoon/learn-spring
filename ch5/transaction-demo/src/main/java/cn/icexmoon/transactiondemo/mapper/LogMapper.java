package cn.icexmoon.transactiondemo.mapper;

import org.apache.ibatis.annotations.Insert;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : transaction-demo
 * @Package : cn.icexmoon.transactiondemo.mapper
 * @ClassName : .java
 * @createTime : 2023/8/26 11:48
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
public interface LogMapper {
    @Insert("insert into log(content,create_time) values (#{content},NOW())")
    void addLog(String content);
}
