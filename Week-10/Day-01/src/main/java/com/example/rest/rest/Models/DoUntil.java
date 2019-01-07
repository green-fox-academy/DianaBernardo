package com.example.rest.rest.Models;

import org.springframework.stereotype.Component;

public class DoUntil {

  private Integer until;

  public DoUntil() {

  }

  public DoUntil(Integer until) {
    this.until = until;
  }

  public Integer getUntil() {
    return until;
  }

  public void setUntil(Integer until) {
    this.until = until;
  }
}
