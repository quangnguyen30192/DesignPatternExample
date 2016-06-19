/* WoodenHouse.java
 * 
 * 1.0
 * 
 * 04-05-2016
 * 
 * Copyright (c) [CompanyName]
 * 
 * Modification Logs:
 * DATE AUTHOR DESCRIPTION
 * --------------------------------------------------------
 * 04-05-2016 Quang Create WoodenHouse class */
package com.quangbnn.pattern.behavioral.template;

/**
 * Insert the introduction of WoodenHouse
 * 
 * @author QuangNguyen
 *
 */
public class WoodenHouse extends HouseTemplate {

  /**
   * @see com.quangbnn.pattern.behavioral.template.HouseTemplate#buildWalls()
   */
  @Override
  public void buildWalls() {
    System.out.println("Build wooden walls");
  }

  /**
   * @see com.quangbnn.pattern.behavioral.template.HouseTemplate#buildPillars()
   */
  @Override
  public void buildPillars() {
    System.out.println("Build pillars with wooden coating");
  }

  /**
   * @see com.quangbnn.pattern.behavioral.template.HouseTemplate#buildWindows()
   */
  @Override
  protected void buildWindows() {
    System.out.println("Build wooden windows");
  }
}
