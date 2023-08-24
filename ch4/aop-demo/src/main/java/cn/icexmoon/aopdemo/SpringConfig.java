package cn.icexmoon.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : aop-demo
 * @Package : cn.icexmoon.aopdemo
 * @ClassName : .java
 * @createTime : 2023/8/24 15:32
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@EnableAspectJAutoProxy
@Configuration
@ComponentScan(basePackages = "cn.icexmoon.aopdemo")
public class SpringConfig {
}
