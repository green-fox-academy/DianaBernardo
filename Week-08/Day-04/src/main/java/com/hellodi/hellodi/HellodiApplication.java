package com.hellodi.hellodi;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@SpringBootApplication
public class HellodiApplication implements CommandLineRunner {


  @Autowired
  Printer printer;

  @Autowired
  MyColor myColor;

  @Autowired
  UtilityService utilityService;

  public static void main(String[] args) {
    SpringApplication.run(HellodiApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("Hey there");
    myColor.printColor();
  }

  @GetMapping("/useful")
  public String useful() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String backgroundColor(Model model) {
    model.addAttribute("randomcolor", utilityService.randomColor());
    return "colored";
  }

  @GetMapping ("/useful/email")
  public String emailValidator() {
    return "email";
  }

  @PostMapping("/useful/email")
  public String sendEmail(Model model, @RequestParam("email") String email) {
    model.addAttribute("validator", utilityService.validateEmail(email));
    model.addAttribute("email", email);
    return "email";
  }

  @GetMapping("/useful/encode")
  public String getWord() {
    return "encoded";
  }

  @PostMapping("/useful/encode")
  public String encode(Model model, @RequestParam("word") String word, @RequestParam("number") int number) {
    model.addAttribute("word", utilityService.caesar(word, number));
    return "encoded";
  }
}

