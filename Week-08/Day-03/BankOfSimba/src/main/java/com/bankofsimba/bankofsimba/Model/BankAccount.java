package com.bankofsimba.bankofsimba.Model;

public class BankAccount {

  private String name;
  private Double balance;
  private String animalType;

  private Boolean king;

  public Boolean getGoodGuy() {
    return goodGuy;
  }

  private Boolean goodGuy;

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public BankAccount(String name, Double balance, String animalType, Boolean king, Boolean goodGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.king = king;
    this.goodGuy = goodGuy;
  }

  public String getName() {
    return name;
  }

  public Double getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public Boolean getKing() {
    return king;
  }


}
