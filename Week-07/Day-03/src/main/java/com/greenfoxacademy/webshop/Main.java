package com.greenfoxacademy.webshop;

public class Main {
  public static void main(String[] args) {
    Item runningShoes = new Item("Running Shoes", "Nike running shoes for everyday sport", 1000.0, 5);
    Item printer = new Item("Printer", "Some HP printer that will print pages", 3000.0, 2);
    Item coke = new Item("Cola Cola", "0.5L standard coke", 25.0, 0);
    Item wokin = new Item("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100);
    Item tshirt = new Item("T-shirt", "Blue with a corgi on a bike", 300.0, 1);

    ExistingItems items = new ExistingItems();

    items.objects.add(runningShoes);
    items.objects.add(printer);
    items.objects.add(coke);
    items.objects.add(wokin);
    items.objects.add(tshirt);
  }
}
