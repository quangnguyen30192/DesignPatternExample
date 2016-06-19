/* Square.java
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
 * 02-05-2016 Quang Create Square class */
package com.quangbnn.pattern.structural.bridge;

/**
 * The one of concrete class of Shape
 * 
 * @author QuangNguyen
 *
 */
public class Square extends AbstractShape {

  /**
   * @param colorDraw
   */
  public Square(IColorDraw colorDraw) {
    super(colorDraw);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void draw() {
    System.out.println(String.format("Square was draw with %s", getColorDraw().drawColor()));
  }
}
