package com.example.rest.rest.Controllers;

import com.example.rest.rest.Models.DoUntil;
import com.example.rest.rest.Models.RestError;
import com.example.rest.rest.Models.Result;
import com.example.rest.rest.Services.DoUntilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class DoUntilController {

  @Autowired
  public DoUntilService service;


  @PostMapping("/dountil/{action}/")
  public Object dountil(@PathVariable("action") String action, @RequestBody (required = false) DoUntil until) {
  if (until == null) {
    return new RestError("Please provide a number!");
  } else {
    if (action.equalsIgnoreCase("sum")) {
      return new Result(service.sum(until.getUntil()));
    } else if (action.equalsIgnoreCase("factor")) {
      return new Result(service.factor(until.getUntil()));
    }else {
      return new RestError("This action is not implemented.");
    }
  }
  }
}
