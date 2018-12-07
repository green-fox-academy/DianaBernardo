package com.dianabernardo.demo;

import java.util.ArrayList;
import java.util.List;

public class ExistingItems {

  String name;

  List<Item> things;
  Item runningShoes = new Item("Running Shoes", "Nike running shoes for everyday sport", 1000, 5);
  Item printer = new Item("Printer", "Some HP printer that will print pages", 3000, 2);
  Item coke = new Item("Cola Cola", "0.5L standard coke", 25, 0);
  Item wokin = new Item("Wokin", "Chicken with fried rice and wokin sauce", 119, 100);
  Item tshirt = new Item("T-shirt", "Blue with a corgi on a bike", 300, 1);

  public ExistingItems() {
    things = new ArrayList<>();
    things.add(runningShoes);
    things.add(printer);
    things.add(coke);
    things.add(wokin);
    things.add(tshirt);
  }

  public String names() {
    for (int i = 0; i < things.size(); i++) {
      return things.get(i).getName();
    }
    return "dfjgkjdf";
  }

  public List<Item> getThings() {
    return things;
  }
}
