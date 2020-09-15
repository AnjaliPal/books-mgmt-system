package com.github.anjalipal.bookmgmt.controller.support;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.web.servlet.server.Session;

class DefaultSessionControllerTest {

    private static final String ANY_VALID_USERNAME = "anyValidUserName";
    private static final String ANY_VALID_PASSWORD = "anyValidPassword";

    @InjectMocks
    private DefaultSessionController defaultSessionController;

    @BeforeEach
    void setUp() throws Exception {
        
    }

    @Test
    @DisplayName("should create a valid session when a valid username and password are provided")
    void shouldCreateAValidSessionWhenAValidUserNameAndPasswordAreProvided() {
        Session session = defaultSessionController.buildSession(ANY_VALID_USERNAME, ANY_VALID_PASSWORD);
        assertNotNull(session, "Did not create a valid session");
    }

}
