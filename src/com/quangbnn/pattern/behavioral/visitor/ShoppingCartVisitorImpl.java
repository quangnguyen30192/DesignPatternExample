/* ShoppingCartVisitorImpl.java
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
 * 06-05-2016 Quang Create ShoppingCartVisitorImpl class */

package com.quangbnn.pattern.behavioral.visitor;

/**
 * Insert the introduction of ShoppingCartVisitorImpl
 *
 * @author QuangNguyen
 */
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    /**
     *
     */
    public ShoppingCartVisitorImpl() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see ShoppingCartVisitor#visit(Book)
     */
    @Override
    public double visit(Book book) {
        System.out.println(String.format("Book name: %s - Price: %,.2f ",
                                         book.getName(),
                                         book.getPrice()));
        return book.getPrice();
    }

    /**
     * @see ShoppingCartVisitor#visit(Fruit)
     */
    @Override
    public double visit(Fruit fruit) {
        double cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(String.format("Fruit: %s - Price: %,.2f", fruit.getName(), cost));
        return cost;
    }
}
