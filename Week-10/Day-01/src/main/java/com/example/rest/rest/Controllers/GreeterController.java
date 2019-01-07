package com.example.rest.rest.Controllers;

import com.example.rest.rest.Models.Greeting;
import com.example.rest.rest.Models.RestError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    if (name == null && title == null) {
      return new RestError("Please provide a name and a title.");
    } else if (name == null) {
      return new RestError("Please provide a name.");
    } else if (title == null) {
      return new RestError("Please provide a title");
    } else {
      return new Greeting (name,title);
    }
  }
}
