package com.reddit.reddit;

import com.reddit.reddit.Repositories.PostRepository;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String title;
  private String url;
  private int votes;


  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private LocalDate date;

  public Post(String title, String url, int votes, LocalDate date) {
    this.title = title;
    this.url = url;
    this.votes = 0;
    this.date = LocalDate.now();
  }

  public Post() {
    this.date = LocalDate.now();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public int getVotes() {
    return votes;
  }

  public void setVotes(int votes) {
    this.votes = votes;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "" + date;
  }
}
