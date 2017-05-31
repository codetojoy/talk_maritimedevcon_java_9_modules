
package com.acme.bids.db.impl;

import com.acme.bids.db.api.User;

import java.sql.DriverManager;

public class UserDaoImpl {
    // spoof field to introduce dependency on java.sql.DriverManager
    private DriverManager driverManager = null;

    public User findUserByName(String name) {
        // spoof the database
        User user = new User();
        user.setName(name);
        return user;
    }
}
