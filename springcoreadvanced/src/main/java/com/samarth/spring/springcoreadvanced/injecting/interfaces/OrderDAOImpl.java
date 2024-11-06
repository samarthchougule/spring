package com.samarth.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOImpl implements OrderDAO {

  @Override
  public void createOrder() {
    System.out.println("Insiddre OrderDAO createOrder()");
  }

}
