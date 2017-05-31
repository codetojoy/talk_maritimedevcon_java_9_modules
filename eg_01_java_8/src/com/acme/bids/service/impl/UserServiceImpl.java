
package com.acme.bids.service.impl;

import com.acme.bids.db.api.User;
import com.acme.bids.db.api.UserDao;

import java.rmi.RemoteException;

public class UserServiceImpl {
    private UserDao userDao = new UserDao();

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
}
