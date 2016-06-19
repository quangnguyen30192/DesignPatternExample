/* DispenseChain.java
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
 * 06-05-2016 Quang Create DispenseChain class */
package com.quangbnn.pattern.behavioral.chainofresponsibility;

/**
 * Insert the introduction of DispenseChain
 * 
 * @author QuangNguyen
 *
 */
public interface DispenseChain {

  void setNextChain(DispenseChain chain);

  void dispense(Currency currency);
}
