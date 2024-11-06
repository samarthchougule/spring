package com.samarth.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext(
        "com/samarth/spring/springcore/innerbeans/config.xml");
    Employee emp = (Employee) context.getBean("Employee");
    System.out.println(emp.hashCode());
    
    Employee emp2 = (Employee) context.getBean("Employee");
    System.out.println(emp2.hashCode());
  }
}
