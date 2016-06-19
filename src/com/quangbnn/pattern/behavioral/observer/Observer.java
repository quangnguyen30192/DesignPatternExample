/* Observer.java
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
 * 07-05-2016 Quang Create Observer class */
package com.quangbnn.pattern.behavioral.observer;

/**
 * Insert the introduction of Observer
 * 
 * @author QuangNguyen
 *
 */
public interface Observer {

  /**
   * Updates all observers, called by subject
   */
  void update();

  /**
   * Sets the subject.
   *
   * @param subject
   *          the new subject
   */
  void setSubject(Subject subject);

  /**
   * Gets the subject.
   *
   * @return the subject
   */
  Subject getSubject();
}
