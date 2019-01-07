package com.example.rest.rest.Services;

import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class ArrayService {
  private Integer[] array;
  private Integer sum;
  private Integer multiply;
  private ArrayList<Integer> resultArray;

  public Integer sum(Integer[] array) {
    sum = 0;
    for (int i: array) {
      sum += i;
    }
    return sum;
  }

  public Integer multiply(Integer[] array) {
    multiply = 1;
    for (int i: array) {
      multiply *= i;
    }
    return multiply;
  }

  public List<Integer> doubling(Integer[] array) {
    resultArray = new ArrayList<>();
    for (int i: array) {
      resultArray.add(new Integer(i*2));
    }
    return resultArray;
  }

  public Integer[] getArray() {
    return array;
  }

  public void setArray(Integer[] array) {
    this.array = array;
  }

  public Integer getSum() {
    return sum;
  }

  public void setSum(Integer sum) {
    this.sum = sum;
  }

  public Integer getMultiply() {
    return multiply;
  }

  public void setMultiply(Integer multiply) {
    this.multiply = multiply;
  }

  public ArrayList<Integer> getResultArray() {
    return resultArray;
  }

  public void setResultArray(ArrayList<Integer> resultArray) {
    this.resultArray = resultArray;
  }
}
