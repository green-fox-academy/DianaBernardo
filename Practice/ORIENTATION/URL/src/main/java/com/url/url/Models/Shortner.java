package com.url.url.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.net.URL;

@Entity
public class Shortner {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String alias;
  private String link;
  private Integer hitCount;

  @JsonIgnore
  private Integer secretCode;

  public Shortner() {

  }

  public Shortner(String alias, String link, Integer hitCount) {
    this.alias = alias;
    this.link = link;
    this.hitCount = 0;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Integer getHitCount() {
    return hitCount;
  }

  public void setHitCount(Integer hitCount) {
    this.hitCount = hitCount;
  }

  public Integer getSecretCode() {
    return secretCode;
  }

  public void setSecretCode(Integer secretCode) {
    this.secretCode = secretCode;
  }
}
