package com.samarth.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext(
        "com/samarth/spring/springcoreadvanced/autowiring/annotations/config.xml");

    Employee emp = (Employee) context.getBean("employee");
    System.out.println(emp);
    
  }
}
