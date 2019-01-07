package com.example.rest.rest.Models;

public class Doubled {

  private Integer input;
  private Integer result;


  public Doubled() {

  }

  public Doubled(Integer input) {
    this.input = input;
    this.result = input * 2;
  }

  public Integer getInput() {
    return input;
  }

  public void setInput(Integer input) {
    this.input = input;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
