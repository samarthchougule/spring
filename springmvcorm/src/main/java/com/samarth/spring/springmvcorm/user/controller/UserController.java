package com.samarth.spring.springmvcorm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.samarth.spring.springmvcorm.user.entity.User;
import com.samarth.spring.springmvcorm.user.services.UserService;

@Controller
public class UserController {

  @Autowired
  private UserService userService;

  public UserService getUserService() {
    return userService;
  }

  public void setUserService(UserService userService) {
    this.userService = userService;
  }

  @RequestMapping("/registrationPage")
  public String showRegistrationPageWithModelMap() {

    return "userReg";
  }

  @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
  public String registerUserWithModelMap(@ModelAttribute("user") User user, ModelMap model) {

    int result = userService.save(user);
    model.addAttribute("result", "User created with id: " + result);
    return "userReg";
  }

  @RequestMapping("/getUsers")
  public String getUsers(ModelMap modelMap) {

    List<User> users = userService.getUsers();
    modelMap.addAttribute("users", users);
    return "displayUsers";
  }

  @RequestMapping("/validateEmail")
  public @ResponseBody String validateEmail(@RequestParam("id") int id) {

    User user = userService.getUser(id);
    String msg = "";
    if (user != null) {
      msg = id + " already exists";
    }
    return msg;
  }

}
