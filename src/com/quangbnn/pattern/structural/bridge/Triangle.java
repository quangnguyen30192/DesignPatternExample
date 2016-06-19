/* 
 * Triangle.java
 *  
 * 1.0
 *  
 * 02-05-2016
 *  
 * Copyright (c) [CompanyName]
 * 
 * Modification Logs:  
 * DATE             AUTHOR           DESCRIPTION  
 * --------------------------------------------------------  
 * 02-05-2016          Quang   				 Create Triangle class 
 */
package com.quangbnn.pattern.structural.bridge;


/**
 * Insert the introduction of Triangle
 * 
 * @author QuangNguyen
 *
 */
public class Triangle extends AbstractShape {

  /**
   * @param colorDraw
   */
  public Triangle(IColorDraw colorDraw) {
    super(colorDraw);
  }

  /** 
   * @see com.quangbnn.pattern.structural.bridge.AbstractShape#draw()
   */
  @Override
  public void draw() {
    System.out.println(String.format("Triangle was draw with %s", getColorDraw().drawColor()));
  }
}
