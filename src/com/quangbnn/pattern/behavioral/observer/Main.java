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
package com.quangbnn.pattern.behavioral.observer;

/**
 * Insert the introduction of Main
 * 
 * @author QuangNguyen
 *
 */
public class Main {

  public static void main(String[] args) {
    Subject mytopic = new MyTopic();
    Observer peter = new MyTopicSubscriber("Peter");
    mytopic.register(peter);
    Observer kay = new MyTopicSubscriber("Kay");
    mytopic.register(kay);
    Observer craw = new MyTopicSubscriber("Craw");
    mytopic.register(craw);
    
    mytopic.postUpdate("Hello");
    mytopic.postUpdate("aaa");
    
    mytopic.postUpdate("Hello Peter", peter);
  }
}
