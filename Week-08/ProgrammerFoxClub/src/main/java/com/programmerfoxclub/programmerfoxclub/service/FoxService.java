package com.programmerfoxclub.programmerfoxclub.service;

import com.programmerfoxclub.programmerfoxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {
  private List<Fox> foxes;
  private List<String> foodList;
  private List<String> drinkList;
  private List<String> tricks;
  private Fox currentFox;

  public FoxService() {
    this.foxes = new ArrayList<>();
    foodList = new ArrayList<>();
    drinkList = new ArrayList<>();
    tricks = new ArrayList<>();
    foodList.add("Pizza");
    foodList.add("Burger");
    foodList.add("Fish");
    drinkList.add("Coke");
    drinkList.add("Tea");
    drinkList.add("Water");
    tricks.add("Play piano");
    tricks.add("Speak French");
    tricks.add("Be invisible");
  }

  public Fox getFoxByName(String name) {
    for (Fox fox : foxes) {
      if (fox.getName().equals(name)) {
        return fox;
      }
    }
    return null;
  }

  public Fox activateFox(String name) {
    return currentFox = getFoxByName(name);
  }

  public List<Fox> getFoxes() {
    return foxes;
  }

  public void setFoxes(List<Fox> foxes) {
    this.foxes = foxes;
  }

  public List<String> getFoodList() {
    return foodList;
  }

  public void setFoodList(List<String> foodList) {
    this.foodList = foodList;
  }

  public List<String> getDrinkList() {
    return drinkList;
  }

  public void setDrinkList(List<String> drinkList) {
    this.drinkList = drinkList;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public void setTricks(List<String> tricks) {
    this.tricks = tricks;
  }

  public Fox getCurrentFox() {
    return currentFox;
  }

  public void setCurrentFox(Fox currentFox) {
    this.currentFox = currentFox;
  }
}
