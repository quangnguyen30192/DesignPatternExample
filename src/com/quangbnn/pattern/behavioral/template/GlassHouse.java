/* 
 * GlassHouse.java
 *  
 * 1.0
 *  
 * 04-05-2016
 *  
 * Copyright (c) [CompanyName]
 * 
 * Modification Logs:  
 * DATE             AUTHOR           DESCRIPTION  
 * --------------------------------------------------------  
 * 04-05-2016          Quang   				 Create GlassHouse class 
 */
package com.quangbnn.pattern.behavioral.template;


/**
 * Insert the introduction of GlassHouse
 * 
 * @author QuangNguyen
 *
 */
public class GlassHouse extends HouseTemplate {

  /** 
   * @see com.quangbnn.pattern.behavioral.template.HouseTemplate#buildWalls()
   */
  @Override
  public void buildWalls() {
    System.out.println("Build glass walls");
  }

  /**
   * @see com.quangbnn.pattern.behavioral.template.HouseTemplate#buildPillars()
   */
  @Override
  public void buildPillars() {
    System.out.println("Build pillars with glass coating");
  }
}
