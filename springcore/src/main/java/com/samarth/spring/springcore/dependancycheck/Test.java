package com.samarth.spring.springcore.dependancycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext(
        "com/samarth/spring/springcore/dependancycheck/config.xml");

    Prescription prescription = (Prescription) context.getBean("prescription");
    System.out.println(prescription);
  }
}
