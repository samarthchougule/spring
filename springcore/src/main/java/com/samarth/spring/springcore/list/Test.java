package com.samarth.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext(
        "com/samarth/spring/springcore/list/listconfig.xml");
    Hospital hospital = (Hospital) context.getBean("Hospital");
    System.out.println(hospital.getName());
    System.out.println(hospital.getDepartments()); 
  }
}
