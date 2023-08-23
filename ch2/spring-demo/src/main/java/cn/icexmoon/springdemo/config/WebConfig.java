package cn.icexmoon.springdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : spring-demo
 * @Package : cn.icexmoon.springdemo
 * @ClassName : .java
 * @createTime : 2023/8/21 18:14
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Configuration
@ComponentScan(basePackages = "cn.icexmoon.springdemo")
@PropertySource("classpath:jdbc.properties")
@Import(JDBCConfig.class)
public class WebConfig {

}
