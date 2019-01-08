package com.example.rest.rest.Controllers;

import com.example.rest.rest.Models.Append;
import com.example.rest.rest.Models.Log;
import com.example.rest.rest.Models.RestError;
import com.example.rest.rest.Services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
public class AppendController {

  private LogService logService;

  @Autowired
  public AppendController(LogService logService) {
    this.logService = logService;
  }

  @GetMapping("/appenda")
  public Object appender(@RequestParam(value = "appended", required = false) String appendable) {
    if (appendable != null) {
      logService.save(new Log("/appenda", appendable));
      return new Append(appendable + "a");
    } else {
      throw new UnsupportedOperationException("Error 404 - Not Found");
    }
  }
}
