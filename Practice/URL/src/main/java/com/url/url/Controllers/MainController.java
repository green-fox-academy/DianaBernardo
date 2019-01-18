package com.url.url.Controllers;

import com.url.url.Models.Shortner;
import com.url.url.Repositories.ShortnerRepository;
import com.url.url.Services.ShortnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

  private ShortnerService shortnerService;
  private ShortnerRepository shortnerRepository;

  public MainController(ShortnerService shortnerService, ShortnerRepository shortnerRepository) {
    this.shortnerService = shortnerService;
    this.shortnerRepository = shortnerRepository;
  }

  @GetMapping("/")
  public String main(Model model) {
    model.addAttribute("shortner", new Shortner());
    return "main";
  }

  @PostMapping("/save-link")
  public String post(@ModelAttribute Shortner shortner, RedirectAttributes attributes, Model model) {
    shortnerService.add(attributes, shortner);
    model.addAttribute("success", shortnerService.success());
    return "redirect:/";
  }
}
