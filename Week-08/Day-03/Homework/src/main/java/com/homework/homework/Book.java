package com.homework.homework;

import java.util.List;

public class Book {
  private static int nextId = 0;

  public int getId() {
    return id;
  }

  private int id;
  private String title;

  public String getAuthor() {
    return author;
  }

  private String author;
  private Integer releaseYear;

  public Book(String title, String author, Integer releaseYear) {
    this.id = nextId++;
    this.title = title;
    this.author = author;
    this.releaseYear = releaseYear;
  }
}
