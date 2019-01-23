package com.tomcat.controller;

import com.tomcat.service.TomcatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSpringMvcAnnotion {

  @Autowired
  private TomcatService tomcatService;

  @RequestMapping(value="/index",produces = "text/html;charset=utf-8")
  public String getIndex(){
    return tomcatService.getIndex();
  }

}
