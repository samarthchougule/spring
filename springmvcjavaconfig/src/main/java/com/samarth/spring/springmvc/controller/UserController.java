package com.samarth.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.samarth.spring.springmvc.dto.User;

@Controller
public class UserController {

  @RequestMapping("/registrationPage")
  public ModelAndView showRegistrationPage() {

    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("userReg");
    return modelAndView;
  }

  @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
  public ModelAndView registerUser(@ModelAttribute("user") User user) {

    System.out.println(user);
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("userResult");

    modelAndView.addObject("user", user);
    return modelAndView;
  }

  @RequestMapping("/registrationPage2")
  public String showRegistrationPageWithModelMap() {

    return "userReg";
  }

  @RequestMapping(value = "/registerUser2", method = RequestMethod.POST)
  public String registerUserWithModelMap(@ModelAttribute("user") User user, ModelMap model) {

    System.out.println(user);
    model.addAttribute("user", user);
    return "userResult";
  }

}
