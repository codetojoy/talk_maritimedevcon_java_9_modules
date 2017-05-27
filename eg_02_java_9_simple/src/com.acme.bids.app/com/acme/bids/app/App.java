
package com.acme.bids.app;

import com.acme.bids.service.api.UserService;

public class App {
    private UserService userService = new UserService();

    private void run() {
        System.out.println("App: process user 'Mozart'");
        userService.processUser("Mozart");
        System.out.println("App: done.");
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}
