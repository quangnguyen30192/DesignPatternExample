/* Subject.java
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
 * 07-05-2016 Quang Create Subject class */
package com.quangbnn.pattern.behavioral.observer;

/**
 * Insert the introduction of Subject.
 *
 * @author QuangNguyen
 */
public interface Subject {

  /**
   * Register.
   *
   * @param observer
   *          the observer
   */
  void register(Observer observer);

  /**
   * Unregister.
   *
   * @param observer
   *          the observer
   */
  void unregister(Observer observer);

  /**
   * Notify observers.
   */
  void notifyObservers();

  /**
   * Notify observers.
   */
  void notifyObserver(Observer observer);

  /**
   * Post update for all observers
   *
   * @param object
   *          the object
   */
  void postUpdate(Object object);

  /**
   * Post update for the specific observer
   *
   * @param object
   *          the object
   * @param observer
   *          the observer
   */
  void postUpdate(Object object, Observer observer);

  /**
   * method to get updates from subject, called by observer
   *
   * @return the updates the
   */
  Object getUpdate();
}
