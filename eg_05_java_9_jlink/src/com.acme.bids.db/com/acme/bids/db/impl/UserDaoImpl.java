
package com.acme.bids.db.impl;

import com.acme.bids.db.api.User;

import java.sql.DriverManager;

public class UserDaoImpl {
    private DriverManager driverManager = null;

    public User findUserByName(String name) {
        // spoof the database
        User user = new User();
        user.setName("Mozart");
        return user;
    }

    public static void main(String[] args) {
        System.out.println("TRACER hello from UserDaoImpl");
    }
}

