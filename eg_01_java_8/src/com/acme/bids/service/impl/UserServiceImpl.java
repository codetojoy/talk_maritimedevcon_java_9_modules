
package com.acme.bids.service.impl;

import com.acme.bids.db.api.User;
import com.acme.bids.db.api.UserDao;

import java.rmi.RemoteException;

public class UserServiceImpl {
    private UserDao userDao = null;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void processUser(String name) {
        User user = userDao.findUserByName(name);
        System.out.println("TRACER processing : " + user.getName());
    }
 
    public void getUsersFromLegacy() {
        try {
            if(true) throw new RemoteException();
        } catch(RemoteException ex) {
        }
    }

    public static void main(String[] args) {
        System.out.println("TRACER : hello from UserServiceImpl");
    }
}

