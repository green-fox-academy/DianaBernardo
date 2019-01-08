package com.example.rest.rest.Controllers;

import com.example.rest.rest.Models.Greeting;
import com.example.rest.rest.Models.Log;
import com.example.rest.rest.Models.RestError;
import com.example.rest.rest.Services.LogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

  private LogService logService;

  public GreeterController(LogService logService) {
    this.logService = logService;
  }

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    logService.save(new Log("/greeter", name + " ; " + title));
    if (name == null && title == null) {
      throw new UnsupportedOperationException("Please provide a name and a title.");
    } else if (name == null) {
      throw new UnsupportedOperationException("Please provide a name.");
    } else if (title == null) {
      throw new UnsupportedOperationException("Please provide a title");
    } else {
      return new Greeting (name,title);
    }
  }
}
