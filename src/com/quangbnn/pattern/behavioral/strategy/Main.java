/* Main.java
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
 * 07-05-2016 Quang Create Main class */
package com.quangbnn.pattern.behavioral.strategy;

/**
 * Insert the introduction of Main
 * 
 * @author QuangNguyen
 *
 */
public class Main {

  public static void main(String[] args) {
      ShoppingCart cart = new ShoppingCart();
      Item item1 = new Item("1234",10);
      cart.add(item1);
      Item item2 = new Item("5678",40);
      cart.add(item2);
      //pay by paypal
      cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
      //pay by credit card
      cart.pay(new CreditCartStrategy("11", "22", "222", "22-33"));
  }
}
