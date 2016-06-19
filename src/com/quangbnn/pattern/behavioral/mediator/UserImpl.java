/* UserImpl.java
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
 * 06-05-2016 Quang Create UserImpl class */

package com.quangbnn.pattern.behavioral.mediator;

/**
 * Insert the introduction of UserImpl
 *
 * @author QuangNguyen
 */
public class UserImpl extends User {

    /**
     * @param chatMediator
     * @param name
     */
    public UserImpl(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
        // TODO Auto-generated constructor stub
    }

    /**
     * @see User#send(String)
     */
    @Override
    public void send(String message) {
        this.chatMediator.sendMessage(message, this);
    }

    /**
     * @see User#receive(String)
     */
    @Override
    public void receive(String message) {
        System.out.println(String.format("%s received messsage: %s", this.name, message));
    }
}
