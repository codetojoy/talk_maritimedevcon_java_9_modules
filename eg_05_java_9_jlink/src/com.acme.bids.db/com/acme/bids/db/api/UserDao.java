
package com.acme.bids.db.api;

import com.acme.bids.db.impl.UserDaoImpl;

public class UserDao {
    private UserDaoImpl userDaoImpl = new UserDaoImpl();

    public User findUserByName(String name) {
        return userDaoImpl.findUserByName(name);
    }
}
