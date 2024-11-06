package com.samarth.spring.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samarth.spring.springaop.ProductService;

public class Test {

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("com/samarth/spring/springaop/test/config.xml");
    ProductService productService = (ProductService) context.getBean("productService");
    int result = productService.multiply(3, 4);
    System.out.println(result);
  }
}
