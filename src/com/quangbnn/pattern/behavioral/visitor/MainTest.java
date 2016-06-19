/* Main.java
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
 * 06-05-2016 Quang Create Main class */
package com.quangbnn.pattern.behavioral.visitor;

/**
 * Insert the introduction of Main
 * 
 * @author QuangNguyen
 *
 */
public class MainTest {

  /**
   * @param args
   */
  public static void main(String[] args) {
    ItemElement[] items = new ItemElement[] { new Fruit("Apple", 20, 4),
                                              new Fruit("Strawberry", 10, 4),
                                              new Book("HowToDo", 20),
                                              new Book("PracticeMakePerfect", 50) };
    double cost = 0;
    ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
    for (ItemElement itemElement : items) {
      cost += itemElement.accept(visitor);
    }
    System.out.println(String.format("Total Cost: %,.2f", cost));
  }
}
