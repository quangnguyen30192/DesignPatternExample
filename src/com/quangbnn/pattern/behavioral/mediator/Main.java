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
package com.quangbnn.pattern.behavioral.mediator;

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
    ChatMediator chatMediator = new ChatMediatorImpl();
    User mike = new UserImpl(chatMediator, "Mike");
    chatMediator.addUser(mike);
    User paul = new UserImpl(chatMediator, "Paul");
    chatMediator.addUser(paul);
    User pike = new UserImpl(chatMediator, "Pike");
    chatMediator.addUser(pike);
    User lucas = new UserImpl(chatMediator, "Lucas");
    chatMediator.addUser(lucas);
    User peter = new UserImpl(chatMediator, "Peter");
    chatMediator.addUser(peter);
    
    mike.send("Hello! Good Morning");
  }
}
