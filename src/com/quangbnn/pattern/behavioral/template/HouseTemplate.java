/* HouseTemplate.java
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
 * 04-05-2016 Quang Create HouseTemplate class */
package com.quangbnn.pattern.behavioral.template;

/**
 * Insert the introduction of HouseTemplate
 * 
 * @author QuangNguyen
 *
 */
public abstract class HouseTemplate {

  public final void buildHouse() {
    buildFoundation();
    buildPillars();
    buildWalls();
    buildWindows();
    System.out.println("House is built");
  }

  // default implementation with overriding later
  protected void buildWindows() {
    System.out.println("Build Glass Windows");
  }

  // default implementation without overriding
  private void buildFoundation() {
    System.out.println("Building foundation with cement,iron rods and sand");
  }
  
  public abstract void buildWalls();
  public abstract void buildPillars();
}