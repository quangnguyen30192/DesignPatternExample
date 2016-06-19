/* MyTopic.java
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
 * 07-05-2016 Quang Create MyTopic class */

package com.quangbnn.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Insert the introduction of MyTopic.
 *
 * @author QuangNguyen
 */
public class MyTopic implements Subject {

    /**
     * The mutex.
     */
    private final Object MUTEX = new Object();
    /**
     * The observers.
     */
    private List<Observer> observers;
    /**
     * The message.
     */
    private String message;
    /**
     * This variable is required so that if there is no update and
     * somebody calls notifyObservers() method, it doesn’t send false notifications
     * to the observers..
     */
    private boolean changed;

    /**
     *
     */
    public MyTopic() {
        this.observers = new LinkedList<>();
    }

    /**
     * @see com.quangbnn.pattern.behavioral.observer.Subject#register(com.quangbnn.pattern.behavioral.observer.Observer)
     */
    @Override
    public void register(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("Observer is null");
        }
        synchronized (this.MUTEX) {
            if (!this.observers.contains(observer)) {
                this.observers.add(observer);
            }
        }
        observer.setSubject(this);
    }

    /**
     * @see com.quangbnn.pattern.behavioral.observer.Subject#unregister(com.quangbnn.pattern.behavioral.observer.Observer)
     */
    @Override
    public void unregister(Observer observer) {
        synchronized (this.MUTEX) {
            if (this.observers.contains(observer)) {
                this.observers.remove(observer);
            }
        }
    }

    /**
     * @see com.quangbnn.pattern.behavioral.observer.Subject#notifyObservers()
     */
    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;
        // synchronization is used to make sure any observer registered after message is received is not
        // notified
        synchronized (this.MUTEX) {
            if (!this.changed) {
                return;
            }
            observersLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }
        for (Observer observer : observersLocal) {
            observer.update();
        }
    }

    /**
     * @see com.quangbnn.pattern.behavioral.observer.Subject#notifyObserver(com.quangbnn.pattern.behavioral.observer.Observer)
     */
    @Override
    public void notifyObserver(Observer observer) {
        List<Observer> observersLocal = null;
        // synchronization is used to make sure any observer registered after message is received is not
        // notified
        synchronized (this.MUTEX) {
            if (!this.changed) {
                return;
            }
            observersLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }
        for (Observer obj : observersLocal) {
            if (obj == observer) {
                obj.update();
            }
        }
    }

    /**
     * @see com.quangbnn.pattern.behavioral.observer.Subject#postUpdate(Object)
     */
    @Override
    public void postUpdate(Object object) {
        String message = (String) object;
        System.out.println(String.format("Message posted to topics: %s", message));
        this.message = message;
        this.changed = true;
        notifyObservers();
    }

    @Override
    public void postUpdate(Object object, Observer observer) {
        String message = (String) object;
        System.out.println(String.format("Message posted to topics: %s", message));
        this.message = message;
        this.changed = true;
        notifyObserver(observer);
    }

    /**
     * @see com.quangbnn.pattern.behavioral.observer.Subject#getUpdate()
     */
    @Override
    public Object getUpdate() {
        return this.message;
    }
}
