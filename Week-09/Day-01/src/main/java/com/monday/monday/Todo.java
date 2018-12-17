package com.monday.monday;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;



  private String title;
  private boolean urgent;
  private boolean done;

  public Todo( String title, boolean urgent, boolean done) {
    this.title = title;
    this.urgent = false;
    this.done = false;
  }

  public Todo() {

  }

  public String getTitle() {
    return title;
  }
}
