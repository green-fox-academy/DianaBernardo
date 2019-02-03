package com.pallidaexam.pallida.Controllers;

import com.pallidaexam.pallida.Repositories.LicenceRepository;
import com.pallidaexam.pallida.Service.LicencePlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LicenceController {

  private LicencePlateService service;
  private LicenceRepository repository;

  @Autowired
  public LicenceController(LicencePlateService service, LicenceRepository repository) {
    this.service = service;
    this.repository = repository;
  }

  @GetMapping("/")
  public String all(Model model) {
  model.addAttribute("licences", service.getAll());
  return "index";
  }

  @PostMapping("/search")
  public String search(Model model, @RequestParam("query") String query) {
    if (service.valid(query)) {
      model.addAttribute("licences", service.search(query));
    } else {
      model.addAttribute("error", "Sorry, the submitted licence plate is not valid");
    }
    return "index";
  }

  @GetMapping("/police")
  public String police(Model model) {
    model.addAttribute("licences", service.police());
    return "index";
  }

  @GetMapping("/diplomat")
  public String diplomat(Model model) {
    model.addAttribute("licences", service.diplomat());
    return "index";
  }

  @RequestMapping("/search/{brand}")
  public String brand(Model model, @PathVariable String brand) {
    model.addAttribute("licences", service.brand(brand));
    return "index";
  }
}
