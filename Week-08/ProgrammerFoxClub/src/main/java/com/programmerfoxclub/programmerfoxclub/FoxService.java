package com.programmerfoxclub.programmerfoxclub;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {
  List<Fox> foxes;

  public FoxService() {
    this.foxes = new ArrayList<>();
  }

  public List getFoxes() {
    return foxes;
  }

  public void setFoxes(List<Fox> foxes) {
    this.foxes = foxes;
  }
}
