/* ChatMediatorImpl.java
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
 * 06-05-2016 Quang Create ChatMediatorImpl class */

package com.quangbnn.pattern.behavioral.mediator;

import java.util.LinkedList;
import java.util.List;

/**
 * Insert the introduction of ChatMediatorImpl
 *
 * @author QuangNguyen
 */
public class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    /**
     *
     */
    public ChatMediatorImpl() {
        this.users = new LinkedList<>();
    }

    /**
     * @see ChatMediator#sendMessage(String,
     * User)
     */
    @Override
    public void sendMessage(String message, User user) {
        for (User item : this.users) {
            if (item != user) {
                item.receive(message);
            }
        }
        System.out.println(String.format("%s sent mesage: %s", user.name, message));
    }

    /**
     * @see ChatMediator#addUser(User)
     */
    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
