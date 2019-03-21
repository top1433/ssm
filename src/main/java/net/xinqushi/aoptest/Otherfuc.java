package net.xinqushi.aoptest;


import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class Otherfuc {

//    @Before("execution(* sleep(..))")
    private void bfsleep(JoinPoint joinPoint){
        System.out.println(joinPoint.getTarget().getClass().getSimpleName()+"睡前洗漱");
//        System.out.println("睡前洗漱");
    }
}
