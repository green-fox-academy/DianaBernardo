package com.dianabernardo.demo;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class Webshop {

  ExistingItems existingItems = new ExistingItems();

  @RequestMapping(value = "/")
  public String webshop(Model model) {
    model.addAttribute("things", existingItems.getThings());
    return "default";
  }

  @RequestMapping(value = "/only-available")
  public String available(Model model) {
    List<Item> availabe = existingItems.things
        .stream()
        .filter(item -> item.getStock() > 0)
        .collect(Collectors.toList());
    model.addAttribute("things", availabe);
    return "default";
  }

  @RequestMapping(value = "/cheapest-first")
  public String cheapest(Model model) {
    List<Item> cheapest = existingItems.things
        .stream()
        .sorted(Comparator.comparing(item -> item.getPrice()))
        .collect(Collectors.toList());
        model.addAttribute("things", cheapest);
        return "default";
  }

  @RequestMapping(value = "/contains-nike")
  public String nike(Model model) {
    List<Item> nike = existingItems.things
        .stream()
        .filter(item -> item.getDescription().toUpperCase().contains("NIKE"))
        .collect(Collectors.toList());
    model.addAttribute("things", nike);
    return "default";
  }

  @PostMapping(value="/search")
  public String search(Model model, @RequestParam("q") String query) {
    List<Item> search = existingItems.things
        .stream()
        .filter(item -> item.getName().toUpperCase().contains(query.toUpperCase()) || item.getDescription().toUpperCase().contains(query.toUpperCase()))
        .collect(Collectors.toList());
        model.addAttribute("things", search);
        return "default";
  }

  /*@RequestMapping(value = "most-expensive")
  public String expensive(Model model) {
    List<Item> max = existingItems.things
        .stream()
        .mapToDouble(Item::getPrice)
        .max()
        .orElseThrow(NoSuchElementException);
        model.addAttribute("things", max);
        return "default";
  }*/
}