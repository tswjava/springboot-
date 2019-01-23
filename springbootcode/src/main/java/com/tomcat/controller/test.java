package com.tomcat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {

  @GetMapping("/pageindex")
  public String getIndex(){
    return "index";
  }

}
