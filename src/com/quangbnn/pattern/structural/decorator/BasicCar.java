/* BasicCar.java
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
 * 02-05-2016 Quang Create BasicCar class */

package com.quangbnn.pattern.structural.decorator;

import java.util.LinkedList;
import java.util.List;

/**
 * Insert the introduction of BasicCar
 *
 * @author QuangNguyen
 */
public class BasicCar extends Car {

    private List<String> list = new LinkedList<>();

    /**
     * @see Car#features()
     */
    @Override
    public void produceFeatures() {
        getFeatures().add("Basic");
    }

    /**
     * @see Car#getFeatures()
     */
    @Override
    public List<String> getFeatures() {
        return this.list;
    }
}
