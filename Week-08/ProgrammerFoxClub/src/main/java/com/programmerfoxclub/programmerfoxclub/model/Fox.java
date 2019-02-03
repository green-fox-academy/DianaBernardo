package com.programmerfoxclub.programmerfoxclub.model;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private List<String> tricks;
  private String food;
  private String drink;

  public Fox(String name) {
    this.name = name;
    tricks = new ArrayList<>();
    this.food = "pizza";
    this.drink = "coke";
  }

  public String getName() {
    return name;
  }

  public List getTricks() {
    return tricks;
  }

  public void setTricks(List<String> tricks) {
    this.tricks = tricks;
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
