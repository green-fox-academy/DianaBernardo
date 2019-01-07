package com.example.rest.rest.Controllers;

import com.example.rest.rest.Models.Append;
import com.example.rest.rest.Models.RestError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
public class AppendController {

  @GetMapping("/appenda/")
  public Object appender(@RequestParam(value = "appended", required = false) String appendable) {
    if (appendable != null) {
      return new Append(appendable + "a");
    } else {
      return new RestError("Error 404 - Not Found");
    }
  }
}
