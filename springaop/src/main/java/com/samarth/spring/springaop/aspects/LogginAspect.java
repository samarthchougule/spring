package com.samarth.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {

  @Before("execution(* com.samarth.spring.springaop.ProductServiceImpl.multiply(..))")
  public void logBefore(JoinPoint joinPoint) {
    System.out.println("Inside logBefore method");
  }

  @After("execution(* com.samarth.spring.springaop.ProductServiceImpl.multiply(..))")
  public void logAfter(JoinPoint joinPoint) {
    System.out.println("Inside logAfter method");
  }
}
