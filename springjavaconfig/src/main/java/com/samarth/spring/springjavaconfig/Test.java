package com.samarth.spring.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//    context.register(SpringConfig.class);
    Service service = context.getBean(Service.class);
    service.save();
    context.close();
  }
}
