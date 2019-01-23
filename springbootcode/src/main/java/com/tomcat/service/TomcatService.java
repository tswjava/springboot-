package com.tomcat.service;

import org.springframework.stereotype.Service;

@Service
public class TomcatService {

   public String getIndex(){
     return "springboot and tomcat";
   }

}
