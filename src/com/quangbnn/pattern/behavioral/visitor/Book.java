/* Book.java
 * 
 * 1.0
 * 
 * 06-05-2016
 * 
 * Copyright (c) [CompanyName]
 * 
 * Modification Logs:
 * DATE AUTHOR DESCRIPTION
 * --------------------------------------------------------
 * 06-05-2016 Quang Create Book class */
package com.quangbnn.pattern.behavioral.visitor;

/**
 * Insert the introduction of Book
 * 
 * @author QuangNguyen
 *
 */
public class Book implements ItemElement {

  private String name;
  private double price;

  public Book(String name, double price) {
    super();
    this.name = name;
    this.price = price;
  }

  /**
   * @see com.quangbnn.pattern.behavioral.visitor.ItemElement#accept(com.quangbnn.pattern.behavioral.visitor.ShoppingCartVisitor)
   */
  @Override
  public double accept(ShoppingCartVisitor visitor) {
    return visitor.visit(this);
  }

  /**
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * @param name
   *          the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the price
   */
  public double getPrice() {
    return this.price;
  }

  /**
   * @param price
   *          the price to set
   */
  public void setPrice(double price) {
    this.price = price;
  }
}
