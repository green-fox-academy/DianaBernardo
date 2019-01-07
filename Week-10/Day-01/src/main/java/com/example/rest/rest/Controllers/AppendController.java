package com.example.rest.rest.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendController {

  @GetMapping("/appenda/")
  public Object appender(@RequestParam(value = "appendable", required = false) String appendable) {
    return appendable + "a";
  }
}
