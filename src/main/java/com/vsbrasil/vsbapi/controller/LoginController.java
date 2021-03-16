//DEPRECATED: another login type with security service avaible and runing.
package com.vsbrasil.vsbapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api")
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "LOGIN - LOGIN - LOGIN - LOGIN - LOGIN - LOGIN - LOGIN - LOGIN";
    }

}
