/* SportCarDecorator.java
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
 * 02-05-2016 Quang Create SportCarDecorator class */

package com.quangbnn.pattern.structural.decorator;

import java.util.List;

/**
 * Insert the introduction of SportCarDecorator
 *
 * @author QuangNguyen
 */
public class SportCarDecorator2 extends CarDecorator2 {

    /**
     * @param car
     */
    public SportCarDecorator2(Car car) {
        super(car);
        // TODO Auto-generated constructor stub
    }

    /**
     * @see Car#produceFeatures()
     */
    @Override
    public void produceFeatures() {
        this.getCar()
            .getFeatures()
            .add("Sport");
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
