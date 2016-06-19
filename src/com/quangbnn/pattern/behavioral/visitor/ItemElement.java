/* 
 * ItemElement.java
 *  
 * 1.0
 *  
 * 06-05-2016
 *  
 * Copyright (c) [CompanyName]
 * 
 * Modification Logs:  
 * DATE             AUTHOR           DESCRIPTION  
 * --------------------------------------------------------  
 * 06-05-2016          Quang   				 Create ItemElement class 
 */
package com.quangbnn.pattern.behavioral.visitor;


/**
 * Insert the introduction of ItemElement
 * 
 * @author QuangNguyen
 *
 */
public interface ItemElement {
  double accept(ShoppingCartVisitor visitor);
}
