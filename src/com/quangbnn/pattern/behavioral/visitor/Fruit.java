/* Fruit.java
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
 * 06-05-2016 Quang Create Fruit class */
package com.quangbnn.pattern.behavioral.visitor;

/**
 * Insert the introduction of Fruit
 * 
 * @author QuangNguyen
 *
 */
public class Fruit implements ItemElement {

  private String name;
  private double pricePerKg;
  private double weight;

  public Fruit(String name, double pricePerKg, double weight) {
    super();
    this.name = name;
    this.pricePerKg = pricePerKg;
    this.weight = weight;
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
   * @return the pricePerKg
   */
  public double getPricePerKg() {
    return this.pricePerKg;
  }

  /**
   * @param pricePerKg
   *          the pricePerKg to set
   */
  public void setPricePerKg(double pricePerKg) {
    this.pricePerKg = pricePerKg;
  }

  /**
   * @return the weight
   */
  public double getWeight() {
    return this.weight;
  }

  /**
   * @param weight
   *          the weight to set
   */
  public void setWeight(double weight) {
    this.weight = weight;
  }
}
