/* Car.java
 * 
 * 1.0
 * 
 * 02-05-2016
 * 
 * Copyright (c) [CompanyName]
 * 
 * Modification Logs:
 * DATE AUTHOR DESCRIPTION
 * --------------------------------------------------------
 * 02-05-2016 Quang Create Car class */
package com.quangbnn.pattern.structural.decorator;

import java.util.List;

/**
 * Insert the introduction of Car.
 *
 * @author QuangNguyen
 */
public abstract class Car {

  /**
   * Adds the features.
   */
  public abstract void produceFeatures();
  
  /**
   * Gets the features.
   *
   * @return the features
   */
  public abstract List<String> getFeatures();
}
