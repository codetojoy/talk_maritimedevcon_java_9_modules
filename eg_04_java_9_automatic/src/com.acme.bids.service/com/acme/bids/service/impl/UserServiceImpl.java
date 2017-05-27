
package com.acme.bids.service.impl;

import com.acme.bids.db.api.User;
import com.acme.bids.db.api.UserDao;

import java.rmi.RemoteException;

public class UserServiceImpl {
    private UserDao userDao = null;

    public UserServiceImpl() {
        userDao = new UserDao();
        System.out.println("created com.acme.bids.service.impl.UserServiceImpl");
    }

    public void processUser(String name) {
        User user = userDao.findUserByName(name);
    }

    // spoof method to introduce dependency on java.rmi.RemoteException
    public void getUsersFromLegacy() {
        try {
            if(true) throw new RemoteException();
        } catch(RemoteException ex) {
        }
    }

    public static void main(String[] args) {
        System.out.println("hello from UserServiceImpl");
    }
}
