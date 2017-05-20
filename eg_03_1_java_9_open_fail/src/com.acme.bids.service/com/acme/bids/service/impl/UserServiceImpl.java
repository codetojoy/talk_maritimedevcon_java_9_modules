
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

    @SuppressWarnings("unchecked")
    private Object getViaReflection(String className) {
        Object result = null;

        try {
           Class c = Class.forName(className);
           result = c.getConstructor().newInstance();
           System.out.println("TRACER created this: " + className);
        } catch (Exception e) {
           System.err.println("TRACER could NOT create " + className +
                              "due to " + e.getClass().getSimpleName());
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("TRACER : hello from UserServiceImpl");
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.getViaReflection("com.acme.bids.db.api.User");
        userServiceImpl.getViaReflection("com.acme.bids.db.impl.UserDaoImpl");
    }
}
