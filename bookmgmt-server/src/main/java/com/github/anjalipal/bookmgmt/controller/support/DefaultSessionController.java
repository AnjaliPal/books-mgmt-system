package com.github.anjalipal.bookmgmt.controller.support;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

import com.github.anjalipal.bookmgmt.controller.SessionController;

@Component
public class DefaultSessionController implements SessionController {

    @Override
    public String getSession(HttpSession session) {
        return session.getId();
    }

}
