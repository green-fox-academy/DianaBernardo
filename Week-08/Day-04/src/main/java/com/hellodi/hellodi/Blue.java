package com.hellodi.hellodi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class Blue implements MyColor{


  @Override
  public void printColor() {
    System.out.println("Blue is the color of the sky.");
  }
}
