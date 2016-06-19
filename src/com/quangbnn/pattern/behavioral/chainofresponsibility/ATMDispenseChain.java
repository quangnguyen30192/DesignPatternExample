/* ATMDispenseChain.java
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
 * 06-05-2016 Quang Create ATMDispenseChain class */
package com.quangbnn.pattern.behavioral.chainofresponsibility;

/**
 * Insert the introduction of ATMDispenseChain
 * 
 * @author QuangNguyen
 *
 */
public class ATMDispenseChain {

  private DispenseChain chain1;

  /**
   * 
   */
  public ATMDispenseChain() {
    chain1 = new ATM50DollarDispenser();
    DispenseChain chain2 = new ATM20DollarDispenser();
    DispenseChain chain3 = new ATM10DollarDispenser();
    chain1.setNextChain(chain2);
    chain2.setNextChain(chain3);
  }

  /**
   * @return the chain1
   */
  public DispenseChain getResponsibilityObject() {
    return this.chain1;
  }
}
