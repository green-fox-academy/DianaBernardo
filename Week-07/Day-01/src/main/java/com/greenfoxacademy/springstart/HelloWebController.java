package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;


@Controller
public class HelloWebController {

  @RequestMapping("/web/greeting")
  public String greeting(Model model) {
    Greeting greeting1 = new Greeting("bla bla");
    model.addAttribute("name", " Diana");
    model.addAttribute("hellos", greeting1.getHellos());
    model.addAttribute("hello", greeting1.randomHello());
    model.addAttribute("size", greeting1.randomSize() + "px");
    model.addAttribute("randomColor", greeting1.colorRandom());
    return "greeting";
  }
}
