package com.programmerfoxclub.programmerfoxclub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  FoxService foxService;

  @Autowired
  public MainController(FoxService foxService) {
    this.foxService = foxService;
  }


  @RequestMapping ("/")
  public String home(@RequestParam(value = "name", required = false) String name, Model model) {
    if(name == null){
      return "redirect:/login";
    }
    for (Fox fox: foxService.foxes) {
      if(name.equalsIgnoreCase(fox.getName())) {
        model.addAttribute("fox", fox);
      }
    }
      return "index";
  }

  @GetMapping("/login")
  public String showLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String postLogin(@ModelAttribute("name") String name, Model model) {
    model.addAttribute("name", name);
    foxService.foxes.add(new Fox(name));
    return "redirect:/?name=" + name;
  }

  @GetMapping("/nutritionStore")
  public String nutrition() {
    return "nutrition";
  }
}
