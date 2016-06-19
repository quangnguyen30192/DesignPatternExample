/* CreditCartStrategy.java
 * 
 * 1.0
 * 
 * 07-05-2016
 * 
 * Copyright (c) [CompanyName]
 * 
 * Modification Logs:
 * DATE AUTHOR DESCRIPTION
 * --------------------------------------------------------
 * 07-05-2016 Quang Create CreditCartStrategy class */

package com.quangbnn.pattern.behavioral.strategy;

/**
 * Insert the introduction of CreditCartStrategy
 *
 * @author QuangNguyen
 */
public class CreditCartStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    /**
     * Instantiates a new credit cart strategy.
     *
     * @param nm         the nm
     * @param ccNum      the cc num
     * @param cvv        the cvv
     * @param expiryDate the expiry date
     */
    public CreditCartStrategy(String nm, String ccNum, String cvv, String expiryDate) {
        this.name = nm;
        this.cardNumber = ccNum;
        this.cvv = cvv;
        this.dateOfExpiry = expiryDate;
    }

    /**
     * @see PaymentStrategy#pay(double)
     */
    @Override
    public void pay(double amount) {
        System.out.printf("%,.2f paid with credit/debit card", amount);
    }
}
