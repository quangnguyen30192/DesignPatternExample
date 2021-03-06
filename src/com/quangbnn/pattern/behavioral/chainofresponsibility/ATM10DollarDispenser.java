/* ATM50DollarDispenser.java
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
 * 06-05-2016 Quang Create ATM50DollarDispenser class */

package com.quangbnn.pattern.behavioral.chainofresponsibility;

/**
 * Insert the introduction of ATM50DollarDispenser
 *
 * @author QuangNguyen
 */
public class ATM10DollarDispenser implements DispenseChain {

    private DispenseChain chain;

    /**
     * @see DispenseChain#setNextChain(DispenseChain)
     */
    @Override
    public void setNextChain(DispenseChain chain) {
        this.chain = chain;
    }

    /**
     * @see DispenseChain#dispense(Currency)
     */
    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 10) {
            int dispense = currency.getAmount() / 10;
            System.out.println(String.format("Dispense %d 10$", dispense));
            int remainder = currency.getAmount() % 10;
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(currency);
        }
    }
}
