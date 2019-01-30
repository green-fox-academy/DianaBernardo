package com.programmerfoxclub.programmerfoxclub;

import java.util.List;

public class Fox {


  private String name;
  private List tricks;
  private String food;
  private String drink;


  public Fox(String name) {
    this.name = name;
    this.food = "pizza";
    this.drink = "coke";
  }

  public String getName() {
    return name;
  }

  public List getTricks() {
    return tricks;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public void setName(String name) {
    this.name = name;
  }
}
