package com.samarth.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext(
        "com/samarth/spring/springcore/constructorinjection/config.xml");

    Employee emp = (Employee) context.getBean("employee");
    System.out.println(emp);
    
    Employee emp2 = (Employee) context.getBean("employee2");
    System.out.println(emp2);
  }
}
