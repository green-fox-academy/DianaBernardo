package com.hellodi.hellodi;

import org.springframework.stereotype.Service;


public class Green implements MyColor {
  @Override
  public void printColor() {
    System.out.println("Green Fox");
  }
}
