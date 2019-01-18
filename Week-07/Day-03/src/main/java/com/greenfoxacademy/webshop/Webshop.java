package com.greenfoxacademy.webshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Webshop {

  @RequestMapping(value = "/")
  public String webshop () {
    return "webshop";
  }
}
