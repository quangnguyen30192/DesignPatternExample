/* RedColor.java
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
 * 02-05-2016 Quang Create RedColor class */
package com.quangbnn.pattern.structural.bridge;

/**
 * Insert the introduction of RedColor
 * 
 * @author QuangNguyen
 *
 */
public class RedColor implements IColorDraw {

  /**
   * @see com.quangbnn.pattern.structural.bridge.IColorDraw#drawColor()
   */
  @Override
  public String drawColor() {
    return "red color";
  }
}
