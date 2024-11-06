package com.samarth.spring.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.samarth.spring.springmvc.dto.Employee;

@Controller
public class ListController {

  @RequestMapping("readList")
  public ModelAndView readList() {

    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("displayList");

    Employee employee1 = new Employee();
    employee1.setId(101);
    employee1.setName("Sam");
    employee1.setSalary(370000);

    Employee employee2 = new Employee();
    employee2.setId(102);
    employee2.setName("Piyush");
    employee2.setSalary(7000000);

    Employee employee3 = new Employee();
    employee3.setId(103);
    employee3.setName("Shubham");
    employee3.setSalary(100000);

    Employee employee4 = new Employee();
    employee4.setId(104);
    employee4.setName("Rushikesh");
    employee4.setSalary(200000);

    List<Employee> employees = new ArrayList<>();
    employees.add(employee1);
    employees.add(employee2);
    employees.add(employee3);
    employees.add(employee4);

    modelAndView.addObject("employees", employees);
    return modelAndView;
  }
}
