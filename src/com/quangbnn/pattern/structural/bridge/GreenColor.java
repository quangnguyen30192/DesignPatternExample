/* 
 * GreenColor.java
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
 * 02-05-2016          Quang   				 Create GreenColor class 
 */
package com.quangbnn.pattern.structural.bridge;


/**
 * Insert the introduction of GreenColor
 * 
 * @author QuangNguyen
 *
 */
public class GreenColor implements IColorDraw {

  /** 
   * @see com.quangbnn.pattern.structural.bridge.IColorDraw#drawColor()
   */
  @Override
  public String drawColor() {
    return "green color";
  }
}
