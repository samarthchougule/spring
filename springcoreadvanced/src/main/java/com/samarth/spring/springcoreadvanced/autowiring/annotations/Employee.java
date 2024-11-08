package com.samarth.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

  @Autowired(required = false)
  @Qualifier("address7829")
  private Address address;

  public Address getAddress() {
    return address;
  }

//  @Autowired
//  public void setAddress(Address address) {
//    this.address = address;
//  }

  @Override
  public String toString() {
    return "Employee [address=" + address + "]";
  }

//  @Autowired
//  Employee(Address address) {
//    this.address = address;
//  }
}
