package com.example.rest.rest.Models;


public class ArrayHandler {

  private Integer[] numbers;
  private String what;

  public ArrayHandler(Integer[] numbers, String what) {
    this.numbers = numbers;
    this.what = what;
  }

  public ArrayHandler() {
  }

  public Integer[] getNumbers() {
    return numbers;
  }

  public String getWhat() {
    return what;
  }

  public void setNumbers(Integer[] numbers) {
    this.numbers = numbers;
  }

  public void setWhat(String what) {
    this.what = what;
  }
}
