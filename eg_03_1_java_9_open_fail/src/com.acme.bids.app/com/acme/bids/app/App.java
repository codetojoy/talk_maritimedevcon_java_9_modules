
package com.acme.bids.app;

import com.acme.bids.db.api.UserDao;
import com.acme.bids.service.api.UserService;

public class App {
    private UserDao userDao = new UserDao();
    private UserService userService = new UserService();

    public static void main(String[] args) {
        System.out.println("TRACER : hello from App");
    }
}

