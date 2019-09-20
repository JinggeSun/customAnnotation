package com.sun.annoation.annoation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


@Component
@Aspect
public class AnnoationAop {

    @Pointcut("@annotation(com.sun.annoation.annoation.Annoation)")
    public void aspect() {

    }

    @Before("aspect()")
    public int add(JoinPoint point) throws NoSuchMethodException {

        Signature signature = point.getSignature();
        Object target = point.getTarget();
        MethodSignature msg=(MethodSignature) signature;
        Method method = target.getClass().getMethod(msg.getName(), msg.getParameterTypes());
        Annoation annotation = method.getAnnotation(Annoation.class);


        int res1 = 100;
        int res2 = 200;

        System.out.println("1-->"+annotation.res());

        return res1 + res2;
    }

}
