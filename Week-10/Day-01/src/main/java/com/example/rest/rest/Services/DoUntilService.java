package com.example.rest.rest.Services;

import com.example.rest.rest.Models.DoUntil;
import org.springframework.stereotype.Service;

import javax.xml.transform.Result;

@Service
public class DoUntilService {

  private Result result;

  public Integer sum(Integer number) {
    Integer sum = 0;
    for (Integer i = number; i > 0; i--) {
      sum += i;
    }
    return sum;
  }

  public Integer factor(Integer number) {
    Integer factor = 0;
    for (Integer i = number; i > 0 ; i--) {
      factor *= i;
    }
    return factor;
  }

  public Result getResult() {
    return result;
  }

  public void setResult(Result result) {
    this.result = result;
  }
}
