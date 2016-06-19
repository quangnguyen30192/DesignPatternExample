/* Currency.java
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
 * 06-05-2016 Quang Create Currency class */
package com.quangbnn.pattern.behavioral.chainofresponsibility;

/**
 * Insert the introduction of Currency
 * 
 * @author QuangNguyen
 *
 */
public class Currency {

  private int amount;

  public Currency(int amount) {
    this.amount = amount;
  }

  public int getAmount() {
    return this.amount;
  }
}
