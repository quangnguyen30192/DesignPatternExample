/* MyTopicSubscriber.java
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
 * 07-05-2016 Quang Create MyTopicSubscriber class */

package com.quangbnn.pattern.behavioral.observer;

/**
 * Insert the introduction of MyTopicSubscriber.
 *
 * @author QuangNguyen
 */
public class MyTopicSubscriber implements Observer {

    /**
     * The name.
     */
    private String name;
    /**
     * The subject.
     */
    private Subject subject;

    /**
     * Instantiates a new my topic subscriber.
     *
     * @param name the name
     */
    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    /**
     * @see Observer#update()
     */
    @Override
    public void update() {
        String message = (String) this.subject.getUpdate();
        if (message == null) {
            System.out.println(String.format("%s:: No new message", this.name));
        } else {
            System.out.println(String.format("%s:: Consuming message:: %s", this.name, message));
        }
    }

    /**
     * @see Observer#setSubject(Subject)
     */
    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    /**
     * @see Observer#getSubject()
     */
    @Override
    public Subject getSubject() {
        return this.subject;
    }
}
