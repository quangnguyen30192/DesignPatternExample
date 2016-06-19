/* PaymentStrategy.java
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
 * 07-05-2016 Quang Create PaymentStrategy class */
package com.quangbnn.pattern.behavioral.strategy;

/**
 * Insert the introduction of PaymentStrategy
 * 
 * @author QuangNguyen
 *
 */
public interface PaymentStrategy {

  void pay(double amount);
}
