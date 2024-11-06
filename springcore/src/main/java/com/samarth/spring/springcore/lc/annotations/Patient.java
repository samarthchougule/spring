package com.samarth.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

  private int id;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    System.out.println("Inside setter");
    this.id = id;
  }

  @PostConstruct
  public void hi() {
    System.out.println("Inside hi method");
  }

  @PreDestroy
  public void bye() {
    System.out.println("Inside bye method");
  }

  @Override
  public String toString() {
    return "Patient [id=" + id + "]";
  }

}
