package com.greenfoxacademy.webshop;

public class Item {

  private String name;
  private String description;
  private double price;
  private int stock;

  public Item(String name, String description, double price, int stock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.stock = stock;
  }
}
