package cn.icexmoon.aopdemo.aspect;

import cn.icexmoon.aopdemo.aspect.annotation.TrimParams;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : aop-demo
 * @Package : cn.icexmoon.aopdemo.aspect
 * @ClassName : .java
 * @createTime : 2023/8/24 21:17
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Component
@Aspect
public class StrAspect {
    /**
     * 任意方法
     */
    @Pointcut("execution(* *..*(..))")
    private void anyMethod() {
    }

    /**
     * 对任意使用了 @TrimParams 注解的方法，检查其参数，如果是 String，进行 trim 处理
     *
     * @param pjp
     * @param annotation
     * @return
     * @throws Throwable
     */
    @Around(value = "anyMethod() && @annotation(annotation)")
    public Object trimParams(ProceedingJoinPoint pjp, TrimParams annotation) throws Throwable {
        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++) {
            Object currentArg = args[i];
            // 如果参数类型是字符串，进行 trim 处理
            if (currentArg instanceof String) {
                String strArg = (String) currentArg;
                args[i] = strArg.trim();
            }
        }
        Object result = pjp.proceed(args);
        return result;
    }
}
