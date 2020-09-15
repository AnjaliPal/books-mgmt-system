package com.github.anjalipal.bookmgmt.controller;

import org.springframework.boot.web.servlet.server.Session;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.Contact;
import io.swagger.annotations.Info;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@SwaggerDefinition(info = @Info(description = "This is the Book Management System APIs", version = "1.0.0", title = "Book Management System", contact = @Contact(name = "Anjali Pal", email = "some@email.com")), consumes = {
"application/json" }, produces = { "application/json" }, schemes = { SwaggerDefinition.Scheme.HTTP,
        SwaggerDefinition.Scheme.HTTPS }, tags = {
                @Tag(name = "Book Management System", description = "Book Management System") })
@Api(tags = { "Book Management System" })
@RestController
@RequestMapping("/bookmgmt")
public interface SessionController {

    /**
     * Creates a valid http session
     * 
     * @param userName
     * @param password
     * 
     * @return a valid session object
     *
     */
    @PostMapping(path = "/sessions/create/", produces = MediaType.APPLICATION_JSON_VALUE)
    Session buildSession(String userName, String password);

}
