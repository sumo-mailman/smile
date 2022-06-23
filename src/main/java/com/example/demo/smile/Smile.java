package com.example.demo.smile;

public class Smile {
  private Integer id;
  private Boolean isCrying;
  private Boolean isLaughing;

  public Smile(Integer id, Boolean isCrying, Boolean isLaughing) {
    this.id = id;
    this.isCrying = isCrying;
    this.isLaughing = isLaughing;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Boolean isCrying() {
    return isCrying;
  }

  public void setIsCrying(Boolean isCrying) {
    this.isCrying = isCrying;
  }

  public Boolean isLaughing() {
    return isLaughing;
  }

  public void setIsLaughing(Boolean isLaughing) {
    this.isLaughing = isLaughing;
  }

}
