package com.bankofsimba.bankofsimba.Controller;

import com.bankofsimba.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

  List<BankAccount> accounts;
  BankAccount simba;

  public HomeController() {
    this.accounts = new ArrayList<>();
    accounts.add(new BankAccount("Nala", 3500.00, "Lion", false, true));
    accounts.add(new BankAccount("Zazu", 1000.00, "Bird", false, false));
    accounts.add(new BankAccount("Timon", 9999.99, "Meerkat", true, true));
    accounts.add(new BankAccount("Pumba", 5.00, "Warthog", true, true));
  }


  @GetMapping("/show")
  public String show(Model model) {
    simba = new BankAccount("Simba", 2000.00, "lion", true, true);
    model.addAttribute(simba);
    return "show";
  }

  @GetMapping("/html")
  public String html() {
    return "html";
  }

  @GetMapping ("/accounts")
  public String showAccounts(Model model) {
    model.addAttribute("accounts", accounts);
    return "accounts";
  }

  @PostMapping("/raisebalance")
  public String raiseBalance(@RequestParam("q") String name) {
    for (BankAccount bankaccount : accounts) {
      if (name.toUpperCase().equals(bankaccount.getName().toUpperCase())) {
        if (bankaccount.getKing()) {
          bankaccount.setBalance(bankaccount.getBalance() + 100);
        } else {
          bankaccount.setBalance(bankaccount.getBalance() + 10);
        }
      }
    }
    return "redirect:/accounts";
  }

  @GetMapping ("/accounts/add")
  public String addAccountForm(Model model, @ModelAttribute("bankaccount") BankAccount bankAccount) {
    model.addAttribute("bankaccount", bankAccount);
    return "addaccount";
  }

  @PostMapping("/accounts/add")
  public String addAccount(@ModelAttribute("bankaccount") BankAccount bankAccount) {
    accounts.add(bankAccount);
    return "redirect:/accounts";
  }
}
