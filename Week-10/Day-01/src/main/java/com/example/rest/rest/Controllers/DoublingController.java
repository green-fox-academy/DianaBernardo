package com.example.rest.rest.Controllers;

import com.example.rest.rest.Models.Doubled;
import com.example.rest.rest.Models.RestError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if(input != null) {
      return new Doubled(input);
    } else {
      return new RestError ("Please provide an input!");
    }
  }
}
