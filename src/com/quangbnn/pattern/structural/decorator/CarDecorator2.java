/* CarDecorator.java
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
 * 02-05-2016 Quang Create CarDecorator class */
package com.quangbnn.pattern.structural.decorator;

/**
 * Insert the introduction of CarDecorator
 * 
 * @author QuangNguyen
 *
 */
public abstract class CarDecorator2 extends Car {

  private Car car;

  /**
   * @return the car
   */
  protected Car getCar() {
    return this.car;
  }

  /**
   * 
   */
  public CarDecorator2(Car car) {
    this.car = car;
  }
}