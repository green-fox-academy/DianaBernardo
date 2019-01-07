package com.example.rest.rest.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @RequestMapping("/")
  public String index() {
    return "index";
  }
}
