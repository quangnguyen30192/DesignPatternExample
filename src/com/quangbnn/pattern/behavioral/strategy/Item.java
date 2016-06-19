/* Item.java
 * 
 * 1.0
 * 
 * 07-05-2016
 * 
 * Copyright (c) [CompanyName]
 * 
 * Modification Logs:
 * DATE AUTHOR DESCRIPTION
 * --------------------------------------------------------
 * 07-05-2016 Quang Create Item class */
package com.quangbnn.pattern.behavioral.strategy;

/**
 * Insert the introduction of Item
 * 
 * @author QuangNguyen
 *
 */
public class Item {

  private String name;
  private double price;

  public Item(String name, double price) {
    super();
    this.name = name;
    this.price = price;
  }

  /**
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * @return the price
   */
  public double getPrice() {
    return this.price;
  }
}
