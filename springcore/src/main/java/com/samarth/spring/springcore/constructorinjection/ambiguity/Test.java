package com.samarth.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext(
        "com/samarth/spring/springcore/constructorinjection/ambiguity/config.xml");

    Addition add = (Addition) context.getBean("addition");
    
  }
}
