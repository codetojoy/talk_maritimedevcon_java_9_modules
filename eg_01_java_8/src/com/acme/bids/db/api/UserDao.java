
package com.acme.bids.db.api;

import com.acme.bids.db.impl.UserDaoImpl;

// for simplicity, we use a facade class instead of an interface
public class UserDao {
    private UserDaoImpl userDaoImpl = new UserDaoImpl();

    public User findUserByName(String name) {
        return userDaoImpl.findUserByName(name);
    }
}
