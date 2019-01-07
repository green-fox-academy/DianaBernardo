package com.example.rest.rest.Models;

import org.springframework.stereotype.Component;

@Component
public class Result {

  private Integer result;

  public Result() {

  }

  public Result(Integer result) {
    this.result = result;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
