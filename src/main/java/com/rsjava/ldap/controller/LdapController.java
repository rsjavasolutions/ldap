package com.rsjava.ldap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LdapController {

    @GetMapping("/users")
    public String sayHello(){
        return "Hello LDAP user";
    }
}
