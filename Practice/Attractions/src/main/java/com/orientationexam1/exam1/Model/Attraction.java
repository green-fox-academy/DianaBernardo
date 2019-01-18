package com.orientationexam1.exam1.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attraction {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String city;
  private Integer price;
  private String category;
  private Integer recommendedAge;

  public Attraction() {
  }

  public Attraction(String name, String city, Integer price, String category, Integer recommendedAge) {
    this.name = name;
    this.city = city;
    this.price = price;
    this.category = category;
    this.recommendedAge = recommendedAge;
  }


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Integer getRecommendedAge() {

    return recommendedAge;
  }

  public void setRecommendedAge(Integer recommendedAge) {
    this.recommendedAge = recommendedAge;
  }
}
