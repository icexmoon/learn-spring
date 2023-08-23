package cn.icexmoon.mybatisdemo.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : mybatis-demo
 * @Package : cn.icexmoon.mybatisdemo.config
 * @ClassName : .java
 * @createTime : 2023/8/23 11:33
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Configuration
public class MyBatisConfig {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        //设置类型别名
        sqlSessionFactoryBean.setTypeAliasesPackage("cn.icexmoon.mybatisdemo.entity");
        return sqlSessionFactoryBean;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("cn.icexmoon.mybatisdemo.mapper");
        return mapperScannerConfigurer;
    }
}
