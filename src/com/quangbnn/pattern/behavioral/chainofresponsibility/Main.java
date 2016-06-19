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
package com.quangbnn.pattern.behavioral.chainofresponsibility;

import java.util.Scanner;

/**
 * Insert the introduction of Main
 * 
 * @author QuangNguyen
 *
 */
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    ATMDispenseChain atmDispenseChain = new ATMDispenseChain();
    while (true) {
      System.out.print("Enter amount to dispense: ");
      Scanner scanner = new Scanner(System.in);
      int amount = scanner.nextInt();
      if (amount % 10 != 0) {
        System.out.println("Amount should be in multiple of 10 dollar");
        return;
      }
      atmDispenseChain.getResponsibilityObject().dispense(new Currency(amount));
    }
  }
}
