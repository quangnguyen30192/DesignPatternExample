/* User.java
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
 * 06-05-2016 Quang Create User class */
package com.quangbnn.pattern.behavioral.mediator;

/**
 * Insert the introduction of User
 * 
 * @author QuangNguyen
 *
 */
public abstract class User {

  protected ChatMediator chatMediator;
  protected String name;

  public User(ChatMediator chatMediator, String name) {
    this.chatMediator = chatMediator;
    this.name = name;
  }

  public abstract void send(String message);

  public abstract void receive(String message);
}
