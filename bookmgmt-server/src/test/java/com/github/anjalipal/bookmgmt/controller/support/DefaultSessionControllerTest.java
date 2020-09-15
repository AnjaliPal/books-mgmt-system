package com.github.anjalipal.bookmgmt.controller.support;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.servlet.http.HttpSession;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class DefaultSessionControllerTest {

    private static final String ANY_VALID_USERNAME = "anyValidUserName";
    private static final String ANY_VALID_PASSWORD = "anyValidPassword";

    @InjectMocks
    private DefaultSessionController defaultSessionController;
    
    @Mock
    private HttpSession session;

    @BeforeEach
    void setUp() throws Exception {
        
    }

    @Test
    @DisplayName("should create a valid session when a valid username and password are provided")
    void shouldCreateAValidSessionWhenAValidUserNameAndPasswordAreProvided() {
        String sessionId = defaultSessionController.getSession(session);
        assertNotNull(sessionId, "Did not create a valid session");
    }

}
