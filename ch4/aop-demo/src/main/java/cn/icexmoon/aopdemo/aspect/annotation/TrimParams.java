package cn.icexmoon.aopdemo.aspect.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : aop-demo
 * @Package : cn.icexmoon.aopdemo.aspect
 * @ClassName : .java
 * @createTime : 2023/8/24 20:57
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description : 用于标记哪些 String 参数需要被 trim 的方法
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TrimParams {
}
