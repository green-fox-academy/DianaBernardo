package com.example.rest.rest.Models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Log {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Temporal(value = TemporalType.TIMESTAMP)
  private Date createdAt;
  private String endpoint;
  private String data;

  public Log(String endpoint, String data) {
    this.createdAt = new Date();
    this.endpoint = endpoint;
    this.data = data;
  }

  public Log() {

  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
