package com.orientationexam1.exam1.Controller;

import com.orientationexam1.exam1.Model.Attraction;
import com.orientationexam1.exam1.Services.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class AttractionRestController {

  private AttractionService service;

  @Autowired
  public AttractionRestController(AttractionService service) {
    this.service = service;
  }

  @GetMapping("/budge")
  @ResponseBody
  public List<Attraction> attractions() {
    return service.getAll();
  }

  @GetMapping("/budgecheap")
  @ResponseBody
  public List<Attraction> cheapest() {
    return service.findCheapest();
  }
}
