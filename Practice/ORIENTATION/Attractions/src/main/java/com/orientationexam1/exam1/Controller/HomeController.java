package com.orientationexam1.exam1.Controller;

import com.orientationexam1.exam1.Model.Attraction;
import com.orientationexam1.exam1.Services.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

  private AttractionService service;

  @Autowired
  public HomeController(AttractionService service) {
    this.service = service;
  }

  @GetMapping("/")
  public String main(Model model, Attraction attraction) {
    model.addAttribute("attractions", service.getAll());
    return "main";
  }

  @GetMapping("/add")
  public String add(@ModelAttribute("attraction")Attraction attraction, Model model) {
    model.addAttribute("attraction", attraction);
    return "redirect:/";
  }

  @PostMapping("/add")
  public String addAttraction(@ModelAttribute Attraction attraction) {
    service.addAttraction(attraction);
    return "redirect:/";
  }

  @GetMapping("/{id}/edit")
  public String edit(@PathVariable Long id, Model model) {
    model.addAttribute("attraction", service.edit(id));
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String editAttraction(@PathVariable Long id, Model model, Attraction attraction) {
    model.addAttribute("attraction", service.editAttraction(attraction));
    return "redirect:/";
  }

}
