
package com.acme.bids.service.api;

import com.acme.bids.service.impl.UserServiceImpl;

// for simplicity, we use a facade class instead of an interface
public class UserService {
    private UserServiceImpl userServiceImpl = new UserServiceImpl();

    public void processUser(String name) {
        userServiceImpl.processUser(name);
    }
}
