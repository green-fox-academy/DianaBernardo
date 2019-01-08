package com.example.rest.rest.Controllers;

import com.example.rest.rest.Models.Doubled;
import com.example.rest.rest.Models.Log;
import com.example.rest.rest.Models.RestError;
import com.example.rest.rest.Services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

  private LogService logService;

  @Autowired
  public DoublingController(LogService logService) {
    this.logService = logService;
  }

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if(input != null) {
      logService.save(new Log("/doubling", input.toString()));
      return new Doubled(input);
    }
      logService.save(new Log("/doubling", "Please provide an input!"));
      throw new UnsupportedOperationException("Please provide an input");
    }
  }
