/* 
 * Rectangle.java
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
 * 02-05-2016          Quang   				 Create Rectangle class 
 */
package com.quangbnn.pattern.structural.bridge;


/**
 * Insert the introduction of Rectangle
 * 
 * @author QuangNguyen
 *
 */
public class Rectangle extends AbstractShape {

  /**
   * @param colorDraw
   */
  public Rectangle(IColorDraw colorDraw) {
    super(colorDraw);
    // TODO Auto-generated constructor stub
  }

  /** 
   * @see com.quangbnn.pattern.structural.bridge.AbstractShape#draw()
   */
  @Override
  public void draw() {
    System.out.println(String.format("Rectangle was draw with %s", getColorDraw().drawColor()));
  }
}
