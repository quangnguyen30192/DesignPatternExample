/* 
 * Main.java
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
 * 04-05-2016          Quang   				 Create Main class 
 */
package com.quangbnn.pattern.behavioral.template;


/**
 * Insert the introduction of Main
 * 
 * @author QuangNguyen
 *
 */
public class Main {
  public static void main(String[] args) {
    HouseTemplate glassHouse = new GlassHouse();
    glassHouse.buildHouse();
    
    HouseTemplate woodenHouse = new WoodenHouse();
    woodenHouse.buildHouse();
  }
}
