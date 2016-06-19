/* RemoveSportCarDecorator.java
 * 
 * 1.0
 * 
 * 03-05-2016
 * 
 * Copyright (c) [CompanyName]
 * 
 * Modification Logs:
 * DATE AUTHOR DESCRIPTION
 * --------------------------------------------------------
 * 03-05-2016 Quang Create RemoveSportCarDecorator class */

package com.quangbnn.pattern.structural.decorator;

import java.util.List;

/**
 * Insert the introduction of RemoveSportCarDecorator
 *
 * @author QuangNguyen
 */
public class RemoveSportCarDecorator1 extends CarDecorator1 {

    /**
     * @param car
     */
    public RemoveSportCarDecorator1(Car car) {
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
            .remove("Sport");
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
