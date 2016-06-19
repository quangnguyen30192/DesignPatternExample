/* ShoppingCartVisitor.java
 * 
 * 1.0
 * 
 * 06-05-2016
 * 
 * Copyright (c) [CompanyName]
 * 
 * Modification Logs:
 * DATE AUTHOR DESCRIPTION
 * --------------------------------------------------------
 * 06-05-2016 Quang Create ShoppingCartVisitor class */
package com.quangbnn.pattern.behavioral.visitor;

/**
 * Insert the introduction of ShoppingCartVisitor
 * 
 * @author QuangNguyen
 *
 */
public interface ShoppingCartVisitor {

  double visit(Book book);

  double visit(Fruit fruit);
}
