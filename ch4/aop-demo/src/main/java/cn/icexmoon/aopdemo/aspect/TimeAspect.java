package cn.icexmoon.aopdemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
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
 * @createTime : 2023/8/24 16:01
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Component
@Aspect
public class TimeAspect {
    /**
     * 切入点，匹配任意 service 层方法调用
     */
    @Pointcut("execution(* cn.icexmoon.aopdemo.service.*Service.*(..))")
    private void anyServiceMethods() {
    }

    @Around("anyServiceMethods()")
    public Object clockExecuteTime(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();
        long begin = System.currentTimeMillis();
        Object result = pjp.proceed();
        long end = System.currentTimeMillis();
        System.out.printf("Method %s.%s() is executed, use %d mills.%n",
                className,
                methodName,
                end - begin);
        return result;
    }
}
