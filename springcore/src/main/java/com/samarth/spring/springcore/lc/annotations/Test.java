package com.samarth.spring.springcore.lc.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {

    AbstractApplicationContext context = new ClassPathXmlApplicationContext(
        "com/samarth/spring/springcore/lc/annotations/config.xml");

    Patient patient = (Patient) context.getBean("patient");
    context.registerShutdownHook();
    System.out.println(patient);

  }
}
