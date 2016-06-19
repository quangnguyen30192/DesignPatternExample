/* Shape.java
 * 
 * 1.0
 * 
 * 02-05-2016
 * 
 * Copyright (c) MGM Technology Partner
 * 
 * Modification Logs:
 * DATE AUTHOR DESCRIPTION
 * --------------------------------------------------------
 * 02-05-2016 Quang Create Shape class */
package com.quangbnn.pattern.structural.bridge;

/**
 * Insert the introduction of Shape
 * 
 * @author QuangNguyen
 *
 */
public abstract class AbstractShape {

  /**
   * The color for drawing such as red, blue, green, ...
   */
  private IColorDraw colorDraw;

  /**
   * Instantiates a new shape.
   *
   * @param colorDraw
   *          the color draw
   */
  public AbstractShape(IColorDraw colorDraw) {
    this.colorDraw = colorDraw;
  }

  /**
   * @return the colorDraw
   */
  public IColorDraw getColorDraw() {
    return this.colorDraw;
  }

  /**
   * @param colorDraw
   *          the colorDraw to set
   */
  public void setColorDraw(IColorDraw colorDraw) {
    this.colorDraw = colorDraw;
  }

  /**
   * Draw the shape with the input color
   */
  public abstract void draw();
}
