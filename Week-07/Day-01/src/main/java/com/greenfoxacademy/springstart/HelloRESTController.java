package com.greenfoxacademy.springstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  /*@RequestMapping(value ="/greeting")
  public Greeting test(@RequestParam String name) {
    //System.out.println(name);
    return new Greeting(1, "Hello, " + name);
  }*/

  @RequestMapping(value = "/greeting")
  public Greeting test(@RequestParam String name) {
    return new Greeting( "Hello, " + name);
  }
}
