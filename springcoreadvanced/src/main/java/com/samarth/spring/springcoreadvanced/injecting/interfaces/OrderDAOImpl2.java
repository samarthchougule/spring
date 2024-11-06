package com.samarth.spring.springcoreadvanced.injecting.interfaces; 

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOImpl2 implements OrderDAO {

  @Override
  public void createOrder() {
    System.out.println("Inside OrderDAOImple2 create order");
  }

}
