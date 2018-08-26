package com.smartzhe.demo.aop;

import io.shardingsphere.core.api.HintManager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * 强制指定 主数据源进行数据访问
 * Created by luohuahua on 18/8/26.
 */
@Aspect
@Component
public class AopMasterAdvice {
    private Logger logger = Logger.getLogger(getClass());

    @Pointcut("execution(public * com.smartzhe.demo.domain.dao.*Mapper.*(..))")
    public void pointcut() {
    }


    @Around("pointcut()")
    public Object arround(ProceedingJoinPoint pjp) throws NoSuchMethodException {
        System.out.println("方法环绕start.....");

        MethodSignature signature = (MethodSignature) pjp.getSignature();
        //从切面中获取当前方法
        Method method = signature.getMethod();
        Master master = method.getDeclaredAnnotation(Master.class);
        HintManager hintManager = null;
        if(master != null){
            hintManager = HintManager.getInstance();
            hintManager.setMasterRouteOnly();
        }
        try {
            Object o = pjp.proceed();
            System.out.println("方法环绕proceed，结果是 :" + o);
            return o;
        } catch (Throwable e) {
            e.printStackTrace();
            return null;
        } finally {
            if(hintManager != null){
                hintManager.close();
            }
        }
    }
}
