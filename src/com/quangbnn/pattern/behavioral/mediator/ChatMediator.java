/* ChatMediator.java
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
 * 06-05-2016 Quang Create ChatMediator class */
package com.quangbnn.pattern.behavioral.mediator;

/**
 * Insert the introduction of ChatMediator
 * 
 * @author QuangNguyen
 *
 */
public interface ChatMediator {

  void sendMessage(String message, User user);

  void addUser(User user);
}
