/* LuxuryDecorator.java
 * 
 * 1.0
 * 
 * 02-05-2016
 * 
 * Copyright (c) [CompanyName]
 * 
 * Modification Logs:
 * DATE AUTHOR DESCRIPTION
 * --------------------------------------------------------
 * 02-05-2016 Quang Create LuxuryDecorator class */

package com.quangbnn.pattern.structural.decorator;

import java.util.List;

/**
 * Insert the introduction of LuxuryDecorator
 *
 * @author QuangNguyen
 */
public class LuxuryDecorator1 extends CarDecorator1 {

    /**
     * @param car
     */
    public LuxuryDecorator1(Car car) {
        super(car);
        // TODO Auto-generated constructor stub
    }

    /**
     * @see Car#produceFeatures()
     */
    @Override
    public void produceFeatures() {
        this.getCar()
            .produceFeatures();
        this.getCar()
            .getFeatures()
            .add("Luxury");
    }

    /**
     * @see Car#getFeatures()
     */
    @Override
    public List<String> getFeatures() {
        return this.getCar()
                   .getFeatures();
    }
}
