package com.github.anjalipal.bookmgmt.controller.support;

import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Component;

import com.github.anjalipal.bookmgmt.controller.SessionController;

@Component
public class DefaultSessionController implements SessionController {

    public Session buildSession(String userName, String password) {
        return new Session();
    }

}
