package com.yige.aop;/**
 * Created by vetech on 2018/8/14.
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 〈〉
 *
 * @author zoujiming
 * @since 2018/8/14
 */
@Configuration
@Aspect
public class AopConfig {

    @Around("@within(org.springframework.web.bind.annotation.RestController)")
    public Object simpleApp(final ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();

        Object o = pjp.proceed();
        System.out.println("return:"+o);
        return o;
    }

}
