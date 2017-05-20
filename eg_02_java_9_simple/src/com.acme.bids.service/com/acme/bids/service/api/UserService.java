
package com.acme.bids.service.api;

import com.acme.bids.db.api.User;
import com.acme.bids.db.api.UserDao;
import com.acme.bids.service.impl.UserServiceImpl;

public class UserService {
    private UserServiceImpl userServiceImpl = new UserServiceImpl();

    public void setUserDao(UserDao userDao) {
        userServiceImpl.setUserDao(userDao);
    }

    public static void main(String[] args) {
        System.out.println("TRACER : hello from UserService");
    }
}

