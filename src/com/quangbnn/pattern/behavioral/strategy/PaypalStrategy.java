/* PaypalStrategy.java
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
 * 07-05-2016 Quang Create PaypalStrategy class */
package com.quangbnn.pattern.behavioral.strategy;

/**
 * Insert the introduction of PaypalStrategy
 * 
 * @author QuangNguyen
 *
 */
public class PaypalStrategy implements PaymentStrategy {

  private String emailId;
  private String password;

  public PaypalStrategy(String email, String pwd) {
    this.emailId = email;
    this.password = pwd;
  }

  /**
   * @see com.quangbnn.pattern.behavioral.strategy.PaymentStrategy#pay(double)
   */
  @Override
  public void pay(double amount) {
    System.out.printf("%,.2f paid with paypal", amount);
  }
}
