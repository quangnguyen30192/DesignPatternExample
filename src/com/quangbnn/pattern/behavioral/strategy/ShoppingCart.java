/* ShoppingCart.java
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
 * 07-05-2016 Quang Create ShoppingCart class */
package com.quangbnn.pattern.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Insert the introduction of ShoppingCart
 * 
 * @author QuangNguyen
 *
 */
public class ShoppingCart {

  private List<Item> items;

  /**
   * 
   */
  public ShoppingCart() {
    items = new ArrayList<>();
  }

  public void add(Item item) {
    this.items.add(item);
  }

  public void remove(Item item) {
    this.items.remove(item);
  }

  public double calculateTotalPrice() {
    double sum = 0;
    for (Item item : items) {
      sum += item.getPrice();
    }
    return sum;
  }

  public void pay(PaymentStrategy paymentStrategy) {
    paymentStrategy.pay(calculateTotalPrice());
  }
}
