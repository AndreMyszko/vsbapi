package com.vsbrasil.vsbapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api")
public class HomeController {
    //not logged user
    @GetMapping("/home")
    public String home() {
        return ("<h1>Welcome</h1><p style='background-color:red;'>This page do not need any autorization to be accessed<p>");
    }

    //logged normal user
    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome User</h1><p style='background-color:blue;'>This page do not need any autorization to be accessed<p>");
    }

    //logged admin user
    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome Admin</h1><p style='background-color:green;'>This page do not need any autorization to be accessed<p>");
    }
    
}
