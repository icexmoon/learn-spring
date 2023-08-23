package cn.icexmoon.mybatisdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mybatis-demo
 * @Package : cn.icexmoon.mybatisdemo
 * @ClassName : .java
 * @createTime : 2023/8/23 10:59
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Configuration
@ComponentScan(basePackages = "cn.icexmoon.mybatisdemo")
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {

}
