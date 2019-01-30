package com.programmerfoxclub.programmerfoxclub;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {
  List<Fox> foxes;
  private List<String> foodList;
  private List<String> drinkList;

  public FoxService() {
    this.foxes = new ArrayList<>();
    foodList = new ArrayList<>();
    drinkList = new ArrayList<>();
    foodList.add("Pizza");
    foodList.add("Burger");
    foodList.add("Bacalhau Com Natas");
    drinkList.add("Coke");
    drinkList.add("Tea");
    drinkList.add("Water");
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
}
