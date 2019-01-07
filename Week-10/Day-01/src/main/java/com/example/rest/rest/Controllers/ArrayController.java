package com.example.rest.rest.Controllers;

import com.example.rest.rest.Models.ArrayHandler;
import com.example.rest.rest.Models.RestError;
import com.example.rest.rest.Models.Result;
import com.example.rest.rest.Services.ArrayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
public class ArrayController {

  @Autowired
  ArrayService service;

  @PostMapping("/arrays")
  public Object arrayHandler(@RequestBody(required = false) ArrayHandler numbers) {
    if (numbers.getWhat().equalsIgnoreCase("sum")) {
      return new Result(service.sum(numbers.getNumbers()));
    } else if (numbers.getWhat().equalsIgnoreCase("multiply")) {
      return new Result((service.multiply(numbers.getNumbers())));
    } else if (numbers.getWhat().equalsIgnoreCase("doubling")) {
      return new Result(service.multiply(numbers.getNumbers()));
    }
    else {
      return new RestError("Please provide what to do with the numbers!");
    }
  }
}
