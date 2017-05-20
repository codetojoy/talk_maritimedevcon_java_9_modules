
package com.acme.bids.app;

import com.acme.bids.db.api.UserDao;
import com.acme.bids.service.api.UserService;

import org.springframework.context.ApplicationContext;

public class App {
    private ApplicationContext applicationContext = null;

    private UserDao userDao = new UserDao();
    private UserService userService = new UserService();

    public static void main(String[] args) {
        System.out.println("TRACER : hello from App");
        System.out.println("TRACER : using " + ApplicationContext.class.getName());
    }
}
