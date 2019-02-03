package com.programmerfoxclub.programmerfoxclub.controller;

import com.programmerfoxclub.programmerfoxclub.model.Fox;
import com.programmerfoxclub.programmerfoxclub.service.FoxService;
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

  @GetMapping ("/")
  public String home(@RequestParam(value = "name", required = false) String name, Model model) {
    if(name == null){
      return "redirect:/login";
    }
    for (Fox fox: foxService.getFoxes()) {
      if(name.equalsIgnoreCase(fox.getName())) {
        model.addAttribute("fox", fox);
        foxService.activateFox(name);
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
    foxService.getFoxes().add(new Fox(name));
    return "redirect:/?name=" + name;
  }

  @GetMapping("/nutrition-store")
  public String nutrition(Model model, @RequestParam(value = "name", required = false) String name, @ModelAttribute("food") String food, @ModelAttribute("drink") String drink) {
    model.addAttribute("name", foxService.activateFox(name));
    model.addAttribute("food", food);
    model.addAttribute("drink", drink);
    model.addAttribute("foodlist", foxService.getFoodList());
    model.addAttribute("drinklist", foxService.getDrinkList());
    return "nutrition";
  }

  @PostMapping("/nutrition-store")
  public String addNutrition(Model model, @RequestParam(value = "name", required = false) String name, @ModelAttribute("food") String food,
                             @ModelAttribute("drink") String drink) {
    foxService.getCurrentFox().setName(name);
    model.addAttribute("name", name);
    model.addAttribute("food", food);
    model.addAttribute("drink", drink);
    return "redirect:/?name=" + name;
  }

  @GetMapping("/tricks")
  public String showTricks(Model model, @ModelAttribute("tricks") String tricks) {
    model.addAttribute("tricks", foxService.getTricks());
    return "tricks";
  }

  @PostMapping("/tricks")
  public String addTrick(Model model,@RequestParam(value = "name", required = false) String name, @ModelAttribute("tricks") String tricks) {
    model.addAttribute("tricks", tricks);
    return "redirect:/?name=" + name;
  }
}
