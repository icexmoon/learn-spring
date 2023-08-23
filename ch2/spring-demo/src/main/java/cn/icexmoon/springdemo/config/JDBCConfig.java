package cn.icexmoon.springdemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : spring-demo
 * @Package : cn.icexmoon.springdemo.config
 * @ClassName : .java
 * @createTime : 2023/8/21 20:10
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
public class JDBCConfig {
    @Value("${jdbc.user}")
    private String user;
    @Value("${jdbc.password}")
    private String password;
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;

    @Bean
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername(user);
        druidDataSource.setPassword(password);
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUrl(url);
        return druidDataSource;
    }
}
