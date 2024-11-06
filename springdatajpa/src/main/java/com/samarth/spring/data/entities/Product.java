package com.samarth.spring.data.entities;

import javax.persistence.Entity;

@Entity
public class Product {

  @javax.persistence.Id
  private Long Id;

  private String name;

  private String description;

  private Double price;

  public Long getId() {
    return Id;
  }

  public void setId(Long id) {
    Id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  @Override
  public String toString() {
    return "Product [Id=" + Id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
  }

}
